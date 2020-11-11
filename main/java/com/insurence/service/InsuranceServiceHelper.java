package com.insurence.service;

import org.springframework.stereotype.Component;

import com.insurence.dto.InsurancePolicyDto;
import com.insurence.entity.InsurancePolicy;

@Component
public class InsuranceServiceHelper {

	public static InsurancePolicyDto entityToDto(InsurancePolicy insurancePolicy) {
		InsurancePolicyDto insurancePolicyDto = new InsurancePolicyDto(insurancePolicy.getPolicyinsuranceId(),
				insurancePolicy.getPolicyinsuranceName(), insurancePolicy.getPolicyinsuranceDesc(),
				insurancePolicy.getPolicyinsuranceTenure(),insurancePolicy.getPolicyinsuranceSumAssured(),
				insurancePolicy.getPolicyinsuranceEmiYearly(),insurancePolicy.getPolicyinsuranceBenfitAmount(),
				insurancePolicy.getToAccount());
	
		return insurancePolicyDto;
		
	}
}
