package com.insurence.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.insurence.dto.InsurancePolicyDto;
import com.insurence.exception.PolicyNotAvailableException;
import com.insurence.repository.InsurancePolicyRepository;
import com.insurence.service.InsurancePolicyService;
import com.insurence.service.InsuranceServiceHelper;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService {

	@Autowired
	InsurancePolicyRepository insurancePolicyRepository;
	
	 private static final Logger logger = LoggerFactory.getLogger(InsurancePolicyServiceImpl.class);

	@Override
	public List<InsurancePolicyDto> getPoliceisList(int pageNumber, int pageSize) throws PolicyNotAvailableException {
		// TODO Auto-generated method stub
		Pageable pageble = PageRequest.of(pageNumber, pageSize);
		if (pageble.getPageSize() == 0) {
			logger.info("No Policies Available");
			throw new PolicyNotAvailableException("This Policeis is not Available");
		}
		logger.info("policie list");
		return insurancePolicyRepository.findAll(pageble).stream().map(InsuranceServiceHelper::entityToDto)
				.collect(Collectors.toList());
	}

	/*
	 * @Override public List<InsurancePolicyDto> getAll(int pageNumber, int
	 * pageSize) throws PolicyNotAvailableException {
	 * 
	 * // TODO Auto-generated method stub
	 * 
	 * Page<InsurancePolicy> policies;// = (Page<InsurancePolicy>) new ArrayList();
	 * List<InsurancePolicyDto> insurancePolicyDtoList = new ArrayList<>(); Pageable
	 * pageable = PageRequest.of(pageNumber, pageSize);
	 * 
	 * policies = insurancePolicyRepository.findAll(pageable); List<InsurancePolicy>
	 * insurancePolicy = policies.getContent();
	 * 
	 * if(insurancePolicy.isEmpty()) { throw new
	 * PolicyNotAvailableException("This Policy is not Available"); }
	 * 
	 * 
	 * for (InsurancePolicy policy : insurancePolicy) { InsurancePolicyDto
	 * insurancePolicyDto = new InsurancePolicyDto();
	 * BeanUtils.copyProperties(policy, insurancePolicyDto);
	 * insurancePolicyDtoList.add(insurancePolicyDto); } return
	 * insurancePolicyDtoList;
	 * 
	 * 
	 * 
	 * }
	 */

}