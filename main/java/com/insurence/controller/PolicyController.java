package com.insurence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurence.dto.InsurancePolicyDto;
import com.insurence.exception.PolicyNotAvailableException;
import com.insurence.service.InsurancePolicyService;

import io.swagger.annotations.Api;

@RestController
@Api(value="getPoliceisList",description="Getting Polices List",tags={"getPoliceisList"})
public class PolicyController {
	@Autowired
	InsurancePolicyService insurancePolicyService;

	@GetMapping(value = "/insurancepolicies")

	public ResponseEntity<List<InsurancePolicyDto>> getPoliceisList(@RequestParam int pageNumber, @RequestParam int pageSize)
			throws PolicyNotAvailableException {
		List<InsurancePolicyDto> list = insurancePolicyService.getPoliceisList(pageNumber, pageSize);
		return new ResponseEntity<List<InsurancePolicyDto>>(list, new HttpHeaders(), HttpStatus.OK);
	}
}
