package com.test.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.test.web.models.Country;
import com.test.web.models.State;
import com.test.web.services.CountryService;
import com.test.web.services.StateService;
@Controller
@RequestMapping(value="states")
public class StateController {
	@Autowired
	StateService stateService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getStates(Model model) {
		List<State> states = stateService.getAll();
		model.addAttribute("listStates", states);
		return "states";
	}
	@Autowired
	CountryService countryService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getState(Model model, @PathVariable("id") int id) {
		List<Country> countries = countryService.getAll();
		model.addAttribute("CountryList", countries);
		State state = stateService.getByKey(id);
		model.addAttribute("dbStates", state);

		return "state";
	
	}
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public String getStatesDelete(Model model, @PathVariable("id") int id) {
		stateService.delete(id);
		return "redirect:/states";
}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String getStatesAdd(Model model, @ModelAttribute("state") State state) {
		stateService.Save(state);
		return "redirect:/states";
	}
}