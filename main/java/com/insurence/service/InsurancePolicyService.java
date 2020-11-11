package com.insurence.service;

import java.util.List;

import com.insurence.dto.InsurancePolicyDto;
import com.insurence.exception.PolicyNotAvailableException;



public interface InsurancePolicyService {

	List<InsurancePolicyDto> getPoliceisList( int pageNumber, int pageSize) throws PolicyNotAvailableException ;

	

}
