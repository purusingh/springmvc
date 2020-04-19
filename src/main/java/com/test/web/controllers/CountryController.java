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
import com.test.web.models.Product;
import com.test.web.services.CountryService;

@Controller
@RequestMapping(value="countries")
public class CountryController {
	@Autowired
	CountryService countryService;
	@RequestMapping(value="", method=RequestMethod.GET)
	public String getCountries(Model model) {
		List<Country> countries=countryService.getAll();
		model.addAttribute("listCountries", countries);
		return "countries";
	}
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String getCountry(Model model, @PathVariable("id") int id) {
		Country country=countryService.getByKey(id);
		model.addAttribute("dbCountry", country);
		return "country";
	}
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public String getCountriesDelete(Model model, @PathVariable("id") int id) {
		countryService.delete(id);
		return "redirect:/products";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String getountriesAdd(Model model, @ModelAttribute("country") Country country) {
		countryService.Save(country);
		return "redirect:/countries";
	}
}
