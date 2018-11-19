package com.hibdemo.SoccerJPADemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "members")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memberid;
	private String membername;
	private String memberrole;
	@Column(name="teamid")
	private Integer teamid;

	@ManyToOne
    @JoinColumn(name="teamid", insertable = false, updatable = false)
	private Team team;

	public Member() {

	}

	public Member(Integer memberid, String membername, String memberrole, Integer teamid, Team team) {
		super();
		this.memberid = memberid;
		this.membername = membername;
		this.memberrole = memberrole;
		this.teamid = teamid;
		this.team = team;
	}

	public Member(String membername, String memberrole, Integer teamid, Team team) {
		super();
		this.membername = membername;
		this.memberrole = memberrole;
		this.teamid = teamid;
		this.team = team;
	}

	public Integer getMemberid() {
		return memberid;
	}

	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMemberrole() {
		return memberrole;
	}

	public void setMemberrole(String memberrole) {
		this.memberrole = memberrole;
	}

	public Integer getTeamid() {
		return teamid;
	}

	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	// @Override
	// public String toString() {
	// return "Member [memberid=" + memberid + ", name=" + membername + ", role=" +
	// memberrole + ", teamid=" + teamid
	// + "]";
	// }

}
