package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/first")
public class HomeController {
	
	//GET is default so if we want to use POST or another method then we should that type of data from jsp file
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		
		model.addAttribute("name", "Priyanshu Baral");
		model.addAttribute("id", 1001);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Abhishek");
		friends.add("Ashish");
		friends.add("Nitin");
		
		model.addAttribute("f", friends);
		
		//It return the page name which can be mapped
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		//Creating ModelAndView Object
		ModelAndView modelAndView = new ModelAndView();
		//setting the data
		modelAndView.addObject("name", "Priyanshu");
		modelAndView.addObject("age", 20);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(80);
		list.add(70);
		list.add(85);
		modelAndView.addObject("marks", list);
		
		//setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
}
