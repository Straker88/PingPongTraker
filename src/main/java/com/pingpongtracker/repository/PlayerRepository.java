package com.pingpongtracker.repository;

import com.pingpongtracker.Modal.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, String> {
}
