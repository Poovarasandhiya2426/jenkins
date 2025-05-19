package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jenkins {
	
	@GetMapping(value="getJenkins")
	public String getJenkins(String name) {
		return name="welcom Jenkins";
		
	}

}
