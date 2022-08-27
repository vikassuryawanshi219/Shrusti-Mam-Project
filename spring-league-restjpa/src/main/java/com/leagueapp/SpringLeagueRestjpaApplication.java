package com.leagueapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leagueapp.model.Board;
import com.leagueapp.model.Fixtures;
import com.leagueapp.model.League;
import com.leagueapp.model.Player;
import com.leagueapp.model.Sports;
import com.leagueapp.model.Team;
import com.leagueapp.repository.ILeagueRepository;
import com.leagueapp.service.IBoardService;
import com.leagueapp.service.ILeagueService;
import com.leagueapp.service.ISportsService;

@SpringBootApplication
public class SpringLeagueRestjpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringLeagueRestjpaApplication.class, args);
	}
	

	@Autowired
	ILeagueService leagueService;
	@Autowired
	IBoardService boardService;
	@Autowired
	ISportsService sportsService;
	
	@Autowired
	ILeagueRepository repository; // to understand about stored procedures
	@Override
	public void run(String... args) throws Exception {
//		Board board = new Board("BCCI","Mumbai","/assets/images/board/cmember.jpg");
//		boardService.addBoard(board);
//		
//		Sports csports = new Sports("Cricket","England","/assets/images/sports/cricket.jpg");
//		sportsService.addSports(csports);
//		Sports tsports = new Sports("Tennis","England","/assets/images/sports/tennis.jpg");
//		sportsService.addSports(tsports);
//		Sports fsports = new Sports("Football","England","/assets/images/sports/football.jpg");
//		sportsService.addSports(fsports);
//		
//		Player player1 = new Player("Rahul",22,"Bangalore","/assets/images/players/rahul.jpg");
//		Player player2 = new Player("Manav",24,"Bangalore","/assets/images/players/manav.jpg");
//		Set<Player> playerSet= new HashSet<>(Arrays.asList(player1,player2));
//		
//		Team teamOne = new Team("TeamOne","Joel",playerSet,"/assets/images/teams/teamone.jpg");
//		
//		Player player3 = new Player("David",22,"Mumbai","/assets/images/players/david.jpg");
//		Player player4 = new Player("Avinash",24,"Mumbai","/assets/images/players/avinash.jpg");
//		Set<Player> playerSet1 = new HashSet<>(Arrays.asList(player3,player4));
//		
//		Team teamTwo = new Team("TeamTwo","Kumaran",playerSet1,"/assets/images/teams/teamtwo.jpg");
//		
//		Player player5 = new Player("Manish",21,"Chennai","/assets/images/players/mani.jpg");
//		Player player6 = new Player("Raju",24,"Chennai","/assets/images/players/raju.jpg");
//		Set<Player> playerSet3 = new HashSet<>(Arrays.asList(player5,player6));
//		
//		Team teamThree = new Team("TeamThree","Srini",playerSet3,"/assets/images/teams/teamthree.jpg");
//		
//		
//		Set<Team> teams = new HashSet<>(Arrays.asList(teamOne,teamTwo));
//		Fixtures match1 = new Fixtures("RCB vs MI","Chinnapa Stadium","/assets/images/fixtures/match1.jpg");
//		match1.setTeams(teams);
//		
//		Set<Team> nteams = new HashSet<>(Arrays.asList(teamOne,teamThree));
//		Fixtures match2 = new Fixtures("RCB vs CSK","Chinnapa Stadium","/assets/images/fixtures/match2.jpg");
//		match2.setTeams(nteams);
//		
//		Set<Fixtures> fixtures = new HashSet<>(Arrays.asList(match1,match2));
//
//		League league = new League();
//		league.setName("T20");
//		league.setDurationInMonths(1);
//		league.setCountry("India");
//		league.setBoard(board);
//		league.setFixtures(fixtures);
//		league.setSports(csports);
//		
		//System.out.println("added "+leagueService.addLeague(league));
//		leagueService.deleteLeague(2);
		
//		List<LeagueView> leagueView = leagueService.getLeagueDetails();
//		for (LeagueView leagueDetails : leagueView) {
//			System.out.println(leagueDetails.getNAME()+"\t"+leagueDetails.getDURATION()+"\t"+leagueDetails.getCOUNTRY());
//		}
//		sportsService.getSportsDetails().forEach((sportsDetails->{
//			System.out.println(sportsDetails.getSPORTSNAME()+"\t"+
//						sportsDetails.getLEAGUENAME()+"\t"+
//						sportsDetails.getMEMBERNAME()+"\t"+
//						sportsDetails.getSQUADS()+"\t"+
//						sportsDetails.getDURATION()+"\t"+
//						sportsDetails.getSTADIUM()	);
//			
//		}));
		
		
//		System.out.println("Total Leagues "+leagueService.getLeagueCount("INDIA"));
		
		
		
	}

}
