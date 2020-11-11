package com.insurence.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurence.entity.CustomerPolicy;
import com.insurence.exception.CustomerNotFoundException;
import com.insurence.service.CustomerPolicyService;

import io.swagger.annotations.Api;

@RestController
@Api(value="getCustomerPoliciesListByCustomerId",description="Searching Insurances by customerId",tags={"getCustomerPoliciesListByCustomerId"})
public class CustomerController {

	@Autowired
	CustomerPolicyService customerPolicyService;

	@GetMapping(value = "/customer")
	public ResponseEntity<List<CustomerPolicy>> getCustomerPoliciesListByCustomerId(
			@Valid @RequestParam(required = false) @NotNull int customerId, @RequestParam int pageNumber,
			@RequestParam int pageSize) throws CustomerNotFoundException {
		List<CustomerPolicy> list = customerPolicyService.getCustomerPolicytListByCustomerId(customerId, pageNumber,
				pageSize);
		return new ResponseEntity<List<CustomerPolicy>>(list, new HttpHeaders(), HttpStatus.OK);

	}

}
