package com.music.recommendation_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class RecommendationServiceApplication {

	private static final Logger logger = LoggerFactory.getLogger(RecommendationServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RecommendationServiceApplication.class, args);
		logger.info("Recommendation service is started");
	}

}
