package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Order.Service.OrderService;
import com.test.Product.Service.ProductService;
import com.test.dto.OrderDto;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private ProductService productService;

	@Autowired
	private OrderService orderService;

	@GetMapping("/orderlist")
	public String order(Model model, String userid, OrderDto dto) {
		
		int res = (orderService.getOrder(dto));
		
		model.addAttribute("product", productService.getStoredList(userid));
		return "storedList";
	}
	 
	@GetMapping("/orderinfo")
	public String orderinfo(Model model) {
		model.addAttribute("product",orderService.OrderInfo());
		return "orderInfo";
	}

}
