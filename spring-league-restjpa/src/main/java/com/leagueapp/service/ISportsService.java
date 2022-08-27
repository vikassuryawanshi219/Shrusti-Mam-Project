package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.Sports;
import com.leagueapp.model.SportsView;

public interface ISportsService {
	Sports addSports(Sports sports);
	Sports getById(int sportsId);
	List<Sports> getAll();
	
	// retrieving from view
	List<SportsView> getSportsDetails();
	
}
