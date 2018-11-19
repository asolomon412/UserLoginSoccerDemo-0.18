package com.hibdemo.SoccerJPADemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hibdemo.SoccerJPADemo.entity.Member;
import com.hibdemo.SoccerJPADemo.entity.Team;
import com.hibdemo.SoccerJPADemo.repo.MemberRepository;
import com.hibdemo.SoccerJPADemo.repo.TeamRepository;

@Controller
public class MemberController {

	@Autowired
	MemberRepository m;

	// needed to autowire this here so that I could show a list of teams on the
	// members page
	// for the dropdown option
	@Autowired
	TeamRepository t;

	@RequestMapping("/member-admin")
	public ModelAndView memberPage() {
		ModelAndView mv = new ModelAndView("members", "memberlist", m.findAll());

		// using this to add the items to the drop down in the page.
		// I wanted to ensure that users were only selecting teams from my
		// list of teams in the DB
		// added this method in the TeamRepository to accomplish this task.
		// Used JPQL to query the DB to find the list of distinct team names
		mv.addObject("teams", t.findDistinctTeam());
		return mv;
	}

	@RequestMapping("/updateperson")
	public ModelAndView updatePerson(Member person) {
		person.getMemberid();
		m.save(person);
		return new ModelAndView("redirect:/member-admin");
	}

	@RequestMapping("/update")
	public ModelAndView updateForm(@RequestParam("personid") int id,@RequestParam("teamid") int tid) {
		ModelAndView mv = new ModelAndView("update-member", "id", id);
		mv.addObject("tid", tid);
		return mv;
	}

	@RequestMapping("/delete")
	public ModelAndView removePerson(@RequestParam("personid") int id) {
		m.deleteById(id);
		return new ModelAndView("redirect:/member-admin");
	}

	@RequestMapping("/add-member")
	public ModelAndView addMember(Member member, @RequestParam("teamname") String teamName) {
		// had to do this because a member needs a teamid to be saved in the DB used the
		// teamname as a reference
		// also added this special method to my TeamRepository to accomplish this task
		// the JPA docs just require you to use camelcase for the abstract method names
		Team team = t.findByTeamname(teamName);
		// this is setting the teamid for the member so it can be saved
		member.setTeamid(team.getTeamid());
		m.save(member);
		return new ModelAndView("redirect:/member-admin");
	}
}
