package com.test.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = { "reports" })
public class ReportController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getReport(Model model) {
		return "reports";
	}
}