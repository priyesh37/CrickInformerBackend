package com.example.api.CrickInformerBackend.service;

import java.util.List;
import java.util.Map;

import com.example.api.CrickInformerBackend.entities.Match;

public interface MatchService {
	
	//get all matches
	
	List<Match> getAllMatches();
	
	
	//get live matches
	
	List<Match> getLiveMatches();
	
	//get cwc2023 matcches
	
	List<Map<String,String>> getPointTable();
	
	
	

}
