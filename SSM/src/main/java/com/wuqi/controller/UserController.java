package com.wuqi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wuqi.entity.User;
import com.wuqi.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		User user = userService.getUserById(1);
		model.addAttribute("user", user);
		return "add";
	}
}
