package springmvcsearch;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserController(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		System.out.println(userId);
		System.out.println(userName);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home view..");
		String str = null;
		System.out.println(str.length());

		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {

		// This is the url if want to perform searching through url
		String url = "https://www.google.com/search?q=" + query;
		RedirectView redirectView = new RedirectView();
		if (query.isBlank()) {
			// return new RedirectView("home");
			// or
			// redirectView.setUrl("home");
			// or
			redirectView.setUrl("redirect:/home");
		} else {

			redirectView.setUrl(url);
		}

		return redirectView;
	}

	// Handling Exception in spring mvc
	
//	@ExceptionHandler(value = NullPointerException.class)
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg", "Null Pointer Exception Exception occured...");
//		return "null_page";
//	}
	
//	@ExceptionHandler(value = NumberFormatException.class)
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg", "Number Format Exception occured...");
//		return "null_page";
//	}

//	@ExceptionHandler({ NullPointerException.class, NumberFormatException.class }) // We can also give other exception
//																					// like this
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg", "Exception occured...");
//		
//		return "null_page";
//	}
	
	//This handles all the exception
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)	//This determines the type of error and this is 500 server error
//	@ExceptionHandler(value = Exception.class)
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg", "Exception occured...");
//		return "null_page";
//	}

}
