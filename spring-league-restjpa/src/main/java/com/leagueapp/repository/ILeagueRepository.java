package com.leagueapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;

@Repository
public interface ILeagueRepository extends JpaRepository<League, Integer>{

	// reading from a view
	
   @Query(value = "select * from leagueview", nativeQuery = true)	
   List<LeagueView> getLeagueDetails();
   
   
   // using named query
    @Query(name = "findByBoard")
    List<League>findLeagueByBoard(String boardname);
   
   
//   // if the procedure name and the method name are same, then no attributes in @Procedure
//   @Procedure
//   Integer GET_LEAGUE_COUNT(String country);

   
//   @Procedure(procedureName = "GET_LEAGUE_COUNT")
//   Integer getLeagueCount(String country);
}
