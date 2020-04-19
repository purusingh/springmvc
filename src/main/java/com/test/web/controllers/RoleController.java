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
import com.test.web.services.RoleService;

@Controller
@RequestMapping(value="roles")
public class RoleController {
	@Autowired
	RoleService roleService;
@RequestMapping(value="", method=RequestMethod.GET)
public String getRoles(Model model) {
	List<Role> roles=roleService.getAll();
	model.addAttribute("listRoles", roles);
	return "roles";
	
}

@RequestMapping(value="/{id}", method=RequestMethod.GET)
public String getRoles(Model model, @PathVariable("id") int id) {
	Role role=roleService.getByKey(id);
	model.addAttribute("dbRole", role);
	return "role";
	
}
@RequestMapping(value="/{id}/delete", method=RequestMethod.GET)
public String getRolesDelete(Model model, @PathVariable("id") int id) {
	roleService.delete(id);
	return "redirect:/roles";
}
@RequestMapping(value="/save", method=RequestMethod.POST)
public String getRolesAdd(Model model, @ModelAttribute("role") Role role) {
	roleService.Save(role);
	return "redirect:/roles";
}
}
