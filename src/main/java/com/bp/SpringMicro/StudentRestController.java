package com.bp.SpringMicro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
	
	 @Autowired
	 private  ApplicationConfig _applicationConfig;
	 
	 
	@GetMapping("/students/getEnv")
	public String retrieveEnvironmentForStudent() {
		return _applicationConfig.getEnv()+"-"+_applicationConfig.getMessage();
	}

}
