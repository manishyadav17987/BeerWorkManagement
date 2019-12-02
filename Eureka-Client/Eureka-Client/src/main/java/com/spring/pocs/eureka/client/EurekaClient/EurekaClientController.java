package com.spring.pocs.eureka.client.EurekaClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eurekaClient")
public class EurekaClientController {
	
	@GetMapping
	public String getEurekaClientName() {
		return "ClientName: Marsh";
		
	}
	
}
