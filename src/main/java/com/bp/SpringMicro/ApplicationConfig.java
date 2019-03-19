package com.bp.SpringMicro;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Validated
@Component
@ConfigurationProperties(prefix = "application")
public class ApplicationConfig {
    @NotNull
    private String env;
	
	 @NotNull
    private String message;

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
 
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
}
