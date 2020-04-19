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
import com.test.web.models.Product;
import com.test.web.services.CategoryService;
import com.test.web.services.ProductService;

@Controller
@RequestMapping(value = "products")
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String Products(Model model) {
		List<Product> products = productService.getAll();
		model.addAttribute("listProducts", products);
		return "products";
	}

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getProduct(Model model, @PathVariable("id") int id) {
		List<Category> categories = categoryService.getAll();
		model.addAttribute("CategoryList", categories);
		Product product = productService.getByKey(id);
		model.addAttribute("dbProduct", product);

		return "product";
	}
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public String getProductsDelete(Model model, @PathVariable("id") int id) {
		productService.delete(id);
		return "redirect:/products";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String getProductsAdd(Model model, @ModelAttribute("product") Product product) {
		productService.Save(product);
		return "redirect:/products";
	}
}
