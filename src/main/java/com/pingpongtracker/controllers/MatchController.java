package com.pingpongtracker.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pingpongtracker.services.MatchService;

@RestController
public class MatchController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	MatchService matchService;
	
	@PostMapping(value="/startGame")
	public void startGame(@RequestBody String test) {
		matchService.test(test);
		logger.info(test);
	}
	
}
