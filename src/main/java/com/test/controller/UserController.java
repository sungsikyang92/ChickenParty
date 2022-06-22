package com.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.test.dto.UserDto;
import com.test.service.UserService;



@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String welcomePage(ModelMap model, UserDto dto) {
		if(dto.getUserId().equals("admin")&&dto.getUserPw().equals("1234")) {
			return "redirect:welcome";
		}
		if(dto.getUserId().equals("user1")&&dto.getUserPw().equals("1234")) {
			UserDto test = userService.infoChain(dto.getUserId());
			return "redirect:welcomechain?userId=" +dto.getUserId() + "&userNm=" + test.getUserNm();
		}
		if(dto.getUserId().equals("user2")&&dto.getUserPw().equals("1234")) {
			UserDto test = userService.infoChain(dto.getUserId());
			return "redirect:welcomechain?userId=" +dto.getUserId() + "&userNm=" + test.getUserNm();
	      }
		model.put("errorMsg", "Please provide the correct userid and userpw");
		
		return "login";
	}
	
	@RequestMapping(value="/welcomechain")
	public String welcomeChain() {
		return "welcomechain";
	}

	@RequestMapping(value="/welcome")
	public String welcomPage() {
		return "welcome";
	}

	@RequestMapping(value="/mylist", method=RequestMethod.GET)
	public String listCheck(Model model) {
		model.addAttribute("list",  userService.info());
		System.out.println(userService.info());
		return "mylist";
	}
	
	@RequestMapping(value="/mylistchain", method=RequestMethod.GET)
	public String CheckOne(Model model, String userId) {
		model.addAttribute("list", userService.infoChain(userId));
		return "mylistchain";
	}
	
	

	
	
	}


