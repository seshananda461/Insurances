package com.insurence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurence.dto.CustomerPolicyRequestDto;
import com.insurence.exception.PolicyNotAvailableException;
import com.insurence.service.OptPolicyService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/test")
@Api(value="optingPolicies",description="Regestering Insurances",tags={"optingPolicy"})
public class OptPolicyController {

	@Autowired
	OptPolicyService optPolicyService;

	@PostMapping("/customerpolicy")
	private ResponseEntity<String> optingPolicies(@RequestBody CustomerPolicyRequestDto customerPolicyDto) throws PolicyNotAvailableException  {
		optPolicyService.optingPolicies(customerPolicyDto);
		return new ResponseEntity<String>("You Registerd Succesfully", HttpStatus.CREATED);

	}

	@GetMapping("/test")
	public String getPortNo() {
		return optPolicyService.getPortNo();
	}
}
