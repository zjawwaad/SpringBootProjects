package com.zaynah.books.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zaynah.books.models.LoginUser;
import com.zaynah.books.models.User;
import com.zaynah.books.services.UserService;

@Controller 
@RequestMapping("/users")
public class UserController {
	
	private final UserService userServ;
	public UserController(UserService userServ) {
			this.userServ = userServ;
	}
	
	@GetMapping("/login/register")
	public String loginReg(Model model, @ModelAttribute ("newUser") User user ){
//		model.addAttribute("newUser", new User());
		model.addAttribute("loginUser", new LoginUser());
		return "User/loginReg.jsp";
	}

	@PostMapping("/login/register")
	public String registerUser(@Valid @ModelAttribute("newUser") User user, BindingResult result,
			HttpSession session, Model model) {
		//check if passwords match   "Match" = uniqueness/category
		if(!user.getPassword().equals(user.getConfirm())) {
			result.rejectValue("password", "Match", "passwords does not match");
		}
		//check if email exist
		if(userServ.getUser(user.getEmail()) != null) {
			result.rejectValue("email", "Unique", "Email already exists!");
		}
		if(result.hasErrors()) {
			model.addAttribute("loginUser", new LoginUser());
			return"User/loginReg.jsp";
		}
		User newUser = userServ.registerUser(user);
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/books";
	}
	//logging in
	@PostMapping("/login")
	public String loginUser(
			@Valid 
			@ModelAttribute("loginUser") LoginUser loginUser, BindingResult result, Model model, HttpSession session) {
		User loggingInUser = userServ.login(loginUser, result);
		if(result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "User/loginReg.jsp";
		}
		session.setAttribute("user_id", loggingInUser.getId());
		model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
		return "redirect:/books";

	}
	//logging out
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/users/login/register";
	}
	
}
