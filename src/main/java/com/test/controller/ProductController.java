package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Product.Service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/userlist")
	public String userList(Model model, String userid) {
		model.addAttribute("product", productService.getStoredList(userid));
		return "storedList";
	}

	@GetMapping("/adminlist")
	public String adminList(Model model) {
		model.addAttribute("product", productService.getStoredByUser());
		return "storedListByUser";
	}  

}

