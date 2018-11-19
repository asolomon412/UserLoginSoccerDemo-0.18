package com.hibdemo.SoccerJPADemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hibdemo.SoccerJPADemo.entity.Team;
import com.hibdemo.SoccerJPADemo.repo.TeamRepository;

@Controller
public class TeamController {

	@Autowired
	TeamRepository t;

	@RequestMapping("/main")
	public ModelAndView index() {
		return new ModelAndView("login-confimed");
	}

	@RequestMapping("/team-admin")
	public ModelAndView teamPage() {
		return new ModelAndView("teams", "teamlist", t.findAll());
	}

	@RequestMapping("/update-team")
	public ModelAndView update(@RequestParam("teamid") String tid) {
		ModelAndView mv = new ModelAndView("update-team", "id", tid);
		mv.addObject("tid", tid);
		return mv;

	}

	@RequestMapping("/updated-team")
	public ModelAndView showForm(@RequestParam("teamid") int teamid, @RequestParam("teamname") String teamname) {
		// wanted to keep all the original info for the team, so that it preserve all of the current team members
		Team preserveTeam = t.findById(teamid).orElse(null);
		preserveTeam.setTeamname(teamname);
		t.save(preserveTeam);
		ModelAndView mv = new ModelAndView("redirect:/team-admin");
		return mv;

	}

	@RequestMapping("/deleteteam")
	public ModelAndView removeTeam(@RequestParam("teamid") int id) {
		t.deleteById(id);
		return new ModelAndView("redirect:/team-admin");
	}

	@RequestMapping("/add-team")
	public ModelAndView addTeam(Team newTeam) {
		t.save(newTeam);
		return new ModelAndView("redirect:/team-admin");
	}
}
