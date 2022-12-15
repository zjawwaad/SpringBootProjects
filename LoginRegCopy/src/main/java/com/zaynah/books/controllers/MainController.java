package com.zaynah.books.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.zaynah.books.services.UserService;

@Controller 
public class MainController {

	private final UserService userServ;
	public MainController(UserService userServ) {
		this.userServ = userServ;
	}
	
	@GetMapping("/books")
	public String dashboard(HttpSession session, Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/login/registration";
		}
		System.out.println("user_id "+ session.getAttribute("user_id"));
		System.out.println("user "+ userServ.getUser((Long) session.getAttribute("user_id")));
		model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
		return "Main/Dashboard.jsp";
	}

}