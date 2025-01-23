package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Register");
		m.addAttribute("Desc", "Home for programmer");
		System.out.println("Adding common Data");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("Showing Form");
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	//Through this Model Attribute annotation the data automatically came into the user field
	public String handleForm(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		
		//isBlank() is a function which is already available
		if (user.getUserName().isBlank()) {
			return "redirect:/contact";
		} else {

		}
		
		//process
		//model.addAttribute("user", user);
		
		int createUser = this.userService.createUser(user);

		model.addAttribute("msg", "User created with id " + createUser);
		
		return "success";
	}
	
	
	/*
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	//Here required is used to get the data otherwise it is default true and optional to use
	public String handleForm(@RequestParam(name = "email", required = true) String userEmail,
					@RequestParam("userName") String userName, 
					@RequestParam("password") String userPassword, Model model) {
		
//		 System.out.println("User Email : " + userEmail);
//		 System.out.println("User Name : " + userName);
//		 System.out.println("User Password : " + userPassword);
		 
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		//process
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
		
		model.addAttribute("user", user);
		
		//This is the old way to fetch data which were done in servlet and jsp
		
		//String email = request.getParameter("email"); System.out.println(email);
		 
		
		return "success";
	}*/
	
}
