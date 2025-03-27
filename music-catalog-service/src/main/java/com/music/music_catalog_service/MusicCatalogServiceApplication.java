package com.music.music_catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class MusicCatalogServiceApplication {

	private static final Logger logger = LoggerFactory.getLogger(MusicCatalogServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MusicCatalogServiceApplication.class, args);
		logger.info("Music-catalog service is started");
	}
}
