package com.pingpongtracker.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer matchId;

	@Column
	String gameType;
	@Column
	String scoreType;
	@Column
	Integer playerOneScore;
	@Column
	Integer playerTwoScore;
	@Column
	String winnerId;
	@Column
	String loserId;

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getScoreType() {
		return scoreType;
	}

	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}

	public Integer getPlayerOneScore() {
		return playerOneScore;
	}

	public void setPlayerOneScore(Integer playerOneScore) {
		this.playerOneScore = playerOneScore;
	}

	public Integer getPlayerTwoScore() {
		return playerTwoScore;
	}

	public void setPlayerTwoScore(Integer playerTwoScore) {
		this.playerTwoScore = playerTwoScore;
	}

	public String getWinnerId() {
		return winnerId;
	}

	public void setWinnerId(String winnerId) {
		this.winnerId = winnerId;
	}

	public String getLoserId() {
		return loserId;
	}

	public void setLoserId(String loserId) {
		this.loserId = loserId;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", gameType=" + gameType + ", scoreType=" + scoreType + ", playerOneScore="
				+ playerOneScore + ", playerTwoScore=" + playerTwoScore + ", winnerId=" + winnerId + ", loserId="
				+ loserId + "]";
	}
	
}
