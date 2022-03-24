package com.th.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.th.model.User;
import com.th.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
@GetMapping("")
public String welcome(Model m)
{
	List<User> users=userService.findAll();
	User user=new User();
	m.addAttribute("user", user);
	m.addAttribute("users", users);
return "index.html";	
}

@PostMapping("add")
public String CreateUser(@ModelAttribute(name = "user") User user)
{
	userService.create(user);
	return "redirect:/";
}
}
