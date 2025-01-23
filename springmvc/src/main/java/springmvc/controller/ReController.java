package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is one handler");
//		
//		//This statement redirect this method to another method
//		return "redirect:/enjoy";
//	}
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is one handler");
		RedirectView redirectView = new RedirectView();
		//When we use RedirectView then we have to give the relative url where we not need to add /
		redirectView.setUrl("enjoy");
		//redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
	//Here simply we done that if we write the one url then it redirect to the enjoy url and the name of the url change from one to enjoy

	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is second handler[enjoy]");
		
		//After redirect from one this handle return the contact page
		return "contact";
	}

}
