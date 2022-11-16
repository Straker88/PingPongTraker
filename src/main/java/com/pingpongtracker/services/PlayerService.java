package com.pingpongtracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pingpongtracker.Modal.Player;
import com.pingpongtracker.repository.PlayerRepository;

@Service
public class PlayerService {
	
    @Autowired
    private PlayerRepository playerRepository;
    
    public List<Player> getAllPlayers()
    {
        List<Player>players = new ArrayList<>();
        playerRepository.findAll().forEach(players::add);
        return players;
    }
    
    public Player addPlayer(Player userRecord)
    {
        return playerRepository.save(userRecord);
    }
}
