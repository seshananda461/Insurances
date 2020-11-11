package com.insurence.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.insurence.entity.CustomerPolicy;

public interface CustomerPolicyService {

	List<CustomerPolicy> getCustomerPolicytListByCustomerId(@Valid @NotNull int customerId, int pageNumber, int pageSize) ;

	

	



}
