package com.leagueapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leagueapp.service.IPlayerService;

@RestController
@RequestMapping("ics-league-api")
@CrossOrigin("http://localhost:4200")
public class PlayerController {
	
//	@Autowired
//	IPlayerService playerService;
	
//	@GetMapping("/sports")
//	public List<Player> getAll(){
//		return playerService.getAll();
//	}

}
