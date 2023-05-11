package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET-API")
public interface ContactGreet {
	@GetMapping("/greet")
	public String invokeGreet();
}
