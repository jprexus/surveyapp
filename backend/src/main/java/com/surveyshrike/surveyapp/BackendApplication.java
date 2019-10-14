package com.surveyshrike.surveyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackageClasses = { BackendApplicationConfig.class }, exclude = {
		SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class })
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
