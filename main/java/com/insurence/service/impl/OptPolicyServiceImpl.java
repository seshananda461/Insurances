package com.insurence.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.insurence.dto.CustomerPolicyRequestDto;
import com.insurence.dto.FundTransactionDto;
import com.insurence.dto.PolicyRequestDto;
import com.insurence.entity.CustomerPolicy;
import com.insurence.entity.InsurancePolicy;
import com.insurence.exception.PolicyNotAvailableException;
import com.insurence.feignclient.FundTransactionClient;
import com.insurence.repository.CustomerRepository;
import com.insurence.repository.InsurancePolicyRepository;
import com.insurence.repository.OptPolicyRepository;
import com.insurence.service.OptPolicyService;

@Service
public class OptPolicyServiceImpl implements OptPolicyService {
 
	
	
	@Autowired
	OptPolicyRepository optPolicyRepository;

	@Autowired
	InsurancePolicyRepository insurancePolicyRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	FundTransactionClient fundTransactionClient;

	 private static final Logger logger = LoggerFactory.getLogger(OptPolicyServiceImpl.class);
	 
	@Override
	@Transactional
	public void optingPolicies(CustomerPolicyRequestDto customerPolicyDto) throws PolicyNotAvailableException  {

		
		Long fromAccount = customerPolicyDto.getFromAccount();
		Integer customerId = customerPolicyDto.getCustomerId();
		List<PolicyRequestDto> insuranceList = new ArrayList<PolicyRequestDto>();
		for (PolicyRequestDto opList : customerPolicyDto.getPolicyDetails()) {
			insuranceList.add(opList);
			throw new PolicyNotAvailableException("Policy Not Available");
			
		}
		//double totalFundTransfer=0;
		//for (PolicyRequestDto policyList : insuranceList) 
		insuranceList.stream().forEach(policyList->{
			Optional<InsurancePolicy> insurancePolicy;
			insurancePolicy = insurancePolicyRepository.findById(policyList.getInsuranceNumber());
			if (!insurancePolicy.isPresent()) {
				logger.info("No policies" );
			
			}
				InsurancePolicy insurance = insurancePolicy.get();
				boolean yearpay = policyList.isYearlyEmi();
				double transferfund;
				double totalFundTransfer=0;
				
					logger.info("Yearly pay policies" );
					transferfund = insurance.getPolicyinsuranceEmiYearly();
					totalFundTransfer += transferfund;
					FundTransactionDto fundTransactionDto = new FundTransactionDto();
					fundTransactionDto.setToAccountNumber(insurance.getToAccount());
					fundTransactionDto.setAccountNumber(fromAccount);
					fundTransactionDto.setAmount(totalFundTransfer);
					fundTransactionDto.setDescription("yearly insuranceamount");
					logger.info("Before Bank client" );
					fundTransactionClient.fundTransfer(fundTransactionDto);
					logger.info("After Bank client:" + fundTransactionClient.fundTransfer(fundTransactionDto) );
				
				CustomerPolicy customerPolicy = new CustomerPolicy();
				customerPolicy.setPolicyId(insurance.getPolicyinsuranceId());
				customerPolicy.setStatus("success");
				customerPolicy.setCustomerId(customerId);

				optPolicyRepository.save(customerPolicy);
				logger.info("Registering policies" );
			});
	
		}
	

	@Override
	public String getPortNo() {
		// TODO Auto-generated method stub
		return "Updated";
	}

}
