package com.music.streaming_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class StreamingServiceApplication {

	private static final Logger logger = LoggerFactory.getLogger(StreamingServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StreamingServiceApplication.class, args);
		logger.info("Streaming service is started");
	}

}
