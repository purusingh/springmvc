package com.test.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.web.models.Role;
import com.test.web.models.User;
import com.test.web.services.RoleService;
import com.test.web.services.UserService;

@Controller
@RequestMapping(value = "users")
public class UserController {
	@Autowired
	UserService userService;

	@Autowired
	RoleService roleService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getUsers(Model model) {
		List<User> users = userService.getAll();
		model.addAttribute("listUsers", users);
		return "users";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getUser(Model model, @PathVariable("id") int id) {
		List<Role> roles = roleService.getAll();
		model.addAttribute("listRoles", roles);
		User user = userService.getByKey(id);
		model.addAttribute("dbUser", user);
		return "user";
	}
	@RequestMapping(value = "/{id/delete}", method = RequestMethod.GET)
	public String getUsersDelete(Model model, @PathVariable("id") int id) {
		userService.delete(id);
		return "redirect:/users";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String getUsersAdd(Model model, @ModelAttribute("user") User user) {
		userService.Save(user);
		return "redirect:/users";
	}
}
