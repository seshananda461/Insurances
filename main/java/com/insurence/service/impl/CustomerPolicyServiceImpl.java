package com.insurence.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.insurence.entity.CustomerPolicy;
import com.insurence.exception.CustomerNotFoundException;
import com.insurence.repository.OptPolicyRepository;
import com.insurence.service.CustomerPolicyService;

@Service
public class CustomerPolicyServiceImpl implements CustomerPolicyService {

	@Autowired
	OptPolicyRepository optPolicyRepository;
	
    private static final Logger logger = LoggerFactory.getLogger(CustomerPolicyServiceImpl.class);

	@Override
	public List<CustomerPolicy> getCustomerPolicytListByCustomerId(int customerId, int pageNumber, int pageSize) throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		/*
		 * Page<CustomerPolicy> policies; List<CustomerPolicy> customerPolicy = new
		 * ArrayList<CustomerPolicy>(); Pageable pageable = PageRequest.of(pageNumber,
		 * pageSize);
		 * 
		 * policies = optPolicyRepository.findBycustomerId(customerId, pageable);
		 * 
		 * for (CustomerPolicy policy : policies) { CustomerPolicy custPolicy = new
		 * CustomerPolicy(); BeanUtils.copyProperties(policy, custPolicy);
		 * customerPolicy.add(policy); }
		 */
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		
		/* CustomerPolicy customerPolicy=new CustomerPolicy(); */
		if(customerId==0) {
			 logger.info("Customer Not Found");
			 throw new 	CustomerNotFoundException("Customer Not Found");
			 
		}
		 logger.info("Customer id");
		return optPolicyRepository.findBycustomerId(customerId,pageable).stream().collect(Collectors.toList());

	
	}
}
