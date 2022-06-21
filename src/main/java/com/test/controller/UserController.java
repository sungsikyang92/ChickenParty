package com.test.controller;




//import org.springframework.context.annotation.Import;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.test.dto.UserDto;



@Controller
//@Import(SecurityJavaConfig.class)
public class UserController {
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Autowired
//	private UserService service;
//	
//	@Autowired
//	BCryptPasswordEncoder passwordEncoder;
//	

	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String welcomePage(ModelMap model, UserDto dto) {
	if(dto.getUserId().equals("admin")&& dto.getUserPw().equals("1234")) {
	return "welcome";
	}
	
	
	
	model.put("errorMsg", "Please provide the correct userid and userpw");
		return "login";
}
	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	@ResponseBody
//	public String Login(ModelMap model, @RequestBody UserDto dto){
//		UserDto res = service.login(dto);
//		
//		
//		
//		if(dto.getUserId().equals("admin")&& dto.getUserPw().equals("1234")) {
//			
//			if(res!=null) {
//				if(passwordEncoder.matches(dto.getUserPw(), res.getUserPw()))
//					System.out.println("비밀번호가 일치합니다.");
//			}
//			
//			return "welcome";
//			
//			
//			}
//			
//
//			model.put("errorMsg", "Please provide the correct userid and userpw");
//				return "login";
//		
//	}
	
	@RequestMapping(value="/welcome")
	public String welcomPage() {
		return "welcome";
	}

	@RequestMapping(value="/mylist", method=RequestMethod.GET)
	public String listCheck(UserDto dto) {
		
		return "mylist";
	}
	
	
//	@ResponseBody
//	public Map<String, Boolean> welcomePage(@RequestBody UserDto dto) {
//		UserDto res = service.login(dto);
//		
//		boolean check = false;
//		if(res!=null) {
//			if(passwordEncoder.matches(dto.getUserPw(), res.getUserPw()))
//				
//				check=true;
//		}
//		Map<String, Boolean> map = new HashMap<String, Boolean>();
//		map.put("check", check);
//		return map;
		

	
	
	}


