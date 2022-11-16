
package com.pingpongtracker.services;

import com.pingpongtracker.Modal.Match;
import com.pingpongtracker.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;
    public List<Match> getAllMatches()
    {
        List<Match>matches = new ArrayList<>();
        matchRepository.findAll().forEach(matches::add);
        return matches;
    }
    public Match addMatch(Match match)
    {
        return matchRepository.save(match);
    }
}

