package com.pingpongtracker.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@PostMapping(value="/startGame")
	public void startGame(@RequestBody String test) {
		logger.info(test);
	}
	
}
