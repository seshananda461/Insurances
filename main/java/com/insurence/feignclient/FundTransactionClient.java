package com.insurence.feignclient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.insurence.dto.FundTransactionDto;


@FeignClient(value="Banking-Service",url="http://localhost:8032/demo")
public interface FundTransactionClient {

	@PostMapping(value = "/bank/fundtransfer")
	public ResponseEntity<String> fundTransfer(@RequestBody   FundTransactionDto   fundTransactionDto);

	
	@GetMapping("/test")
	public String getPortNo();
}