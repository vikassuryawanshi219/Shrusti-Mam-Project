package com.leagueapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leagueapp.model.Fixtures;

@Repository
public interface IFixturesRepository extends JpaRepository<Fixtures, Integer>{

	
}
