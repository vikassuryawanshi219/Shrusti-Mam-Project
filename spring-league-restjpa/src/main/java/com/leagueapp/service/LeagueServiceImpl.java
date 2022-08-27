/**
 * 
 */
package com.leagueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;
import com.leagueapp.repository.ILeagueRepository;

/**
 * @author shristi
 *
 */
@Service
public class LeagueServiceImpl implements ILeagueService{

	
	@Autowired
	ILeagueRepository leagueRepository;
	@Override
	public League addLeague(League league) {
		return leagueRepository.save(league);
	}

	@Override
	public void updateLeague(League league) {
		leagueRepository.save(league)	;	
	}

	@Override
	public void deleteLeague(int leagueId) {
		leagueRepository.deleteById(leagueId);		
	}

	@Override
	public League getById(int leagueId) {
		return leagueRepository.findById(leagueId).get();
	}

	@Override
	public List<League> getAll() {
		return leagueRepository.findAll();
	}

	@Override
	public List<LeagueView> getLeagueDetails() {
		return leagueRepository.getLeagueDetails();
	}

	@Override
	public Integer getLeagueCount(String country) {
		return null;
//		return leagueRepository.GET_LEAGUE_COUNT(country);
//		return leagueRepository.getLeagueCount(country);
	}

	@Override
	public List<League> getLeagueByBoard(String boardname) {
		return null;
//		return leagueRepository.findLeagueByBoard(boardname);
	}

}
