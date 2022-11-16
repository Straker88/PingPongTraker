package com.pingpongtracker.Modal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer playerId;
    String playerName;
}
