package com.pingpongtracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MatchService {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public void test(String args){
        String sql = "INSERT INTO player (name) VALUES ("
                + "'Nam Ha Minh')";
         
        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }
    }
    
}
