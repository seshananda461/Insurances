package com.insurence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.insurence.config.RibbonConfiguration;



@SpringBootApplication

  @EnableFeignClients
  
  @EnableEurekaClient
  
  @RibbonClient(value="Banking-Service",configuration=RibbonConfiguration.
  class)
 
public class InsurencesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsurencesApplication.class, args);
	}

}
