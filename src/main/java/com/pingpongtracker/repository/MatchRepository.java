package com.pingpongtracker.repository;

import com.pingpongtracker.Modal.Match;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, String> {
}
