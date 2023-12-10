package com.example.api.CrickInformerBackend.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.CrickInformerBackend.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {
	
	Optional<Match> findByTeamHeading(String teamHeadString);

}
