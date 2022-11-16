package com.pingpongtracker.controllers;

import com.pingpongtracker.Modal.Match;
import com.pingpongtracker.services.MatchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import com.pingpongtracker.services.MatchService;


@RestController
public class MatchController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
  
	@Autowired
	MatchService matchService;
	@PostMapping(value="/save-match")
	public void saveMatch(@RequestBody Match match) {
		matchService.addMatch(match);
	}

	@GetMapping(value="/matches")
	public List<Match> getAllMatches() {
		return matchService.getAllMatches();

	}
	
}
