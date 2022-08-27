package com.leagueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagueapp.model.Sports;
import com.leagueapp.model.SportsView;
import com.leagueapp.repository.ISportsRepository;

@Service
public class SportsServiceImpl implements ISportsService{
	
	@Autowired
	ISportsRepository sportsRepository;

	@Override
	public Sports addSports(Sports sports) {
		return sportsRepository.save(sports);
	}

	@Override
	public Sports getById(int sportsId) {
		return sportsRepository.findById(sportsId).get();
	}

	@Override
	public List<Sports> getAll() {
		return sportsRepository.findAll();
	}

	@Override
	public List<SportsView> getSportsDetails() {
		return null;
//		return sportsRepository.getSportsDetails();
	}

}
