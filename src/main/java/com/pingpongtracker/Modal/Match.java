package com.pingpongtracker.Modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer matchId;
    String gameType;
    String scoreType;
    Integer playerOneScore;
    Integer playerTwoScore;
    String winnerId;
    String loserId;
}
