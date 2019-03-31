package com.bp.SpringMicro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class StudentRestController {
	
	 @Autowired
	 private  ApplicationConfig _applicationConfig;
	
	//This is not required , just for tetsing other ways
	@Value("${application.env}")
        private String environment;
	 
	 
	@GetMapping("/students/getEnv")
	public String retrieveEnvironmentForStudent() {
		return _applicationConfig.getEnv()+"-"+_applicationConfig.getMessage()+"---"+environment;
	}

}
