package com.insurence.service;

import com.insurence.dto.CustomerPolicyRequestDto;
import com.insurence.exception.PolicyNotAvailableException;

public interface OptPolicyService {

	void optingPolicies(CustomerPolicyRequestDto customerPolicyDto)
			throws  PolicyNotAvailableException ;

	String getPortNo();

}
