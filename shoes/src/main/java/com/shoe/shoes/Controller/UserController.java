package com.shoe.shoes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoe.shoes.entity.Users;

import com.shoe.shoes.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@GetMapping("/")
	public String home() {
		
		return "index";
	}
	
	
	
	
@GetMapping("/users")
public String listUsers(Model model) {
	model.addAttribute("users", userService.getAllUsers());
	return "users";
}
@GetMapping("/users/new")
public String createUserForm(Model model) {
	
	
	Users users =  new Users();
	model.addAttribute("user",users);
	return "create_student";
	
	
}

@GetMapping("/welcome")
public String welcome(@RequestParam String id, @RequestParam String pass) {
	if (id.equals("sam")&&pass.equals("root")) {
		
		return "welcome";
	}
	else {
		
		
		return "index";
	}
	
	
	
}
@PostMapping("/users")
public String saveUsers(@ModelAttribute("users") Users users) {
	userService.saveStudent(users);
	
	return "redirect:/users";
	}


}
