package com.pingpongtracker.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pingpongtracker.Modal.Player;
import com.pingpongtracker.services.PlayerService;

@RestController
public class PlayerController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    PlayerService playerService;
    
    @PostMapping(value="/add-player")
    public void addPlayer(@RequestBody Player player) {
    	logger.info(player.toString());
        playerService.addPlayer(player);
    }
    @GetMapping(value="/players")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }
}
