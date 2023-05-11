package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Autowired
    private	ContactGreet greetApi;
	
	@GetMapping("/welcome")
	public String welcome() {
		String welcome = "<h2>Welcome Home</h2>";
		String greet = this.greetApi.invokeGreet();
		return welcome+" \n"+greet;
	}
}
