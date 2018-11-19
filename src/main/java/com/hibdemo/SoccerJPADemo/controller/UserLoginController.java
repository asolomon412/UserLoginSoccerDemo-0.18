package com.hibdemo.SoccerJPADemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hibdemo.SoccerJPADemo.entity.User;
import com.hibdemo.SoccerJPADemo.repo.UserRepository;

@Controller
public class UserLoginController {
	@Autowired
	UserRepository u;

	@RequestMapping("/")
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@RequestMapping("/login-confirmed")
	public ModelAndView loginNew(User user) {
		ModelAndView mv = new ModelAndView("login-confimed");
		u.save(user);
		return mv;
	}

	@RequestMapping("/login-request")
	public ModelAndView loginRequest(User user, RedirectAttributes redirectAttrs) {
		ModelAndView mv = new ModelAndView("login-confimed");
		if (u.findByUsername(user.getUsername()) != null) {
			if (u.findByUsername(user.getUsername()).getPassword().equals(user.getPassword())) {
				return mv;
			}
			
		}
		
		redirectAttrs.addFlashAttribute("message", "Invalid Credentials");

		mv = new ModelAndView("redirect:/");
		return mv;
	}

	@RequestMapping("/logout")
	public ModelAndView logout(RedirectAttributes redirectAttrs) {
		ModelAndView mv = new ModelAndView("redirect:/");
		redirectAttrs.addFlashAttribute("message", "Logged out!");
		return mv;
	}
	
}
