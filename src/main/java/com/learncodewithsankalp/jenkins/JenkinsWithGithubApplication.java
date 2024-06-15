package com.learncodewithsankalp.jenkins;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsWithGithubApplication {
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsWithGithubApplication.class);
	
	public void init() {
		logger.info("Application Started......");
	}

	public static void main(String[] args) {
		logger.info("Main method started..");
		SpringApplication.run(JenkinsWithGithubApplication.class, args);
	}

}
