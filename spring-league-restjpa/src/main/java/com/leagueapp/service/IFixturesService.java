package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.Fixtures;

public interface IFixturesService {
	Fixtures addFixtures(Fixtures fixtures);
	void updateFixtures(Fixtures fixtures);
	void deleteFixtures(int fixturesId);
	Fixtures getById(int fixturesId);
	List<Fixtures> getAll();

	List<Fixtures> getFixturesByLeague(String leagueName);
	List<Fixtures> getFixturesByTeamName(String teamname);
}
