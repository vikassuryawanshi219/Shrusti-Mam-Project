package com.leagueapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leagueapp.model.Player;

@Repository
public interface IPlayerRepository extends JpaRepository<Player, Integer>{

}
