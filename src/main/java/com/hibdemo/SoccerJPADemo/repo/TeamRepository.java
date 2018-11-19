package com.hibdemo.SoccerJPADemo.repo;

import java.util.TreeSet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hibdemo.SoccerJPADemo.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
	
	// this is a special query to help me find the distinct teams to show in a dropdown option (on the members table)
	// that will only allow members to choose from options in my current team table in the DB
	@Query("select distinct teamname from Team")
	TreeSet<String> findDistinctTeam();
	
	// special query used to find a team by the teamname column
	// Used the JPA docs: https://docs.spring.io/spring-data/jpa/docs/1.5.0.RC1/reference/html/jpa.repositories.html
	Team findByTeamname(String teamname);
	
	
}
