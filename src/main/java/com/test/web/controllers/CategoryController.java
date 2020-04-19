package com.test.web.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.web.models.Category;
import com.test.web.services.CategoryService;

@Controller
@RequestMapping(value="categories")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	@RequestMapping(value="", method=RequestMethod.GET)
	public String getCategories(Model model) {
		List<Category> categories=categoryService.getAll();
		model.addAttribute("listCategories",categories);
		return "categories";
	}
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String getCategory(Model model, @PathVariable("id") int id) {
	Category category=categoryService.getByKey(id);
	model.addAttribute("dbCategory",category);
	return "category";
	}
	@RequestMapping(value="/{id}/delete", method=RequestMethod.GET)
	public String getCategoryDelete(Model model, @PathVariable("id") int id) {
		categoryService.delete(id);
		return "redirect:/categories";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String getCategoryAdd(Model model, @ModelAttribute("product") Category category) {
		categoryService.Save(category);
		return "redirect:/categories";
	}
}
