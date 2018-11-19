package com.hibdemo.SoccerJPADemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer teamid;
	private String teamname;

	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Member> members = new ArrayList<>();

	public Team() {

	}

	// for creating new team with name and some members
	public Team(Integer teamid, String teamname, List<Member> members) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
	}

	// for updating
	public Team(String teamname, List<Member> members) {
		super();
		this.teamname = teamname;
	}

	// in case we want to create a new team with no members
	public Team(String teamname) {
		super();
		this.teamname = teamname;
	}

	public Integer getTeamid() {
		return teamid;
	}

	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

//	@Override
//	public String toString() {
//		return "Team [teamid=" + teamid + ", teamname=" + teamname + ", members=" + members + "]";
//	}

}
