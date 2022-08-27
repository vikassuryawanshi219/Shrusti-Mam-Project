package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;

public interface IPlayerService {
	League addLeague(League league);
	void updateLeague(League league);
	void deleteLeague(int leagueId);
	League getById(int leagueId);
	List<League> getAll();

	// retrieving from view
	List<LeagueView> getLeagueDetails();
	
	// using named queries
	List<League> getLeagueByBoard(String boardname);

	// calling stored procedure
	Integer getLeagueCount(String country);
}
