package com.example.api.CrickInformerBackend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.CrickInformerBackend.entities.Match;
import com.example.api.CrickInformerBackend.service.MatchService;

@RestController

@RequestMapping("/match")
public class MatchController {

	
	private MatchService matchService ;

	public MatchController(MatchService matchService) {
		
		this.matchService = matchService;
	}
	
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
	  return new ResponseEntity<>(this.matchService.getLiveMatches(),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
	}
	
	
	
}
