package com.leagueapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// to retrieve data from view
public interface SportsView {

//	the view created using three tables
	
//	create or replace view teamview as 
//	select l.name as leaguename, m.squads,s.name as sportsname from league l 
//	inner join matches m on m.league_id=l.league_id 
//	inner join sports s on s.sports_id=l.sports_id;
	
	// the column names should be capital letters
	String getSPORTSNAME();
	String getLEAGUENAME();
//	String getMEMBERNAME();
	int getDURATION();
	String getSQUADS();
	String getSTADIUM();
	

	
}
