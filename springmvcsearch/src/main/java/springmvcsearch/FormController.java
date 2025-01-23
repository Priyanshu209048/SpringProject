package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		
		return "complex_form";
	}
	
	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {
		//BindingResult class is used to bind data
		//hasErrors method check that there is error or not
		if (result.hasErrors()) {
			return "complex_form";
		}
		
		System.out.println(student);
		System.out.println(student.getAddress());
		
		return "success";
	}
	
}
