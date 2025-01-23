package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice	//This tells the mc that this is the exceptional handler program
public class MyExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg", "Null Pointer Exception Exception occured...");
		return "null_page";
	}

	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumber(Model m) {
		m.addAttribute("msg", "Number Format Exception occured...");
		return "null_page";
	}

//	@ExceptionHandler({ NullPointerException.class, NumberFormatException.class }) // We can also give other exception
//																					// like this
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg", "Exception occured...");
//		
//		return "null_page";
//	}

	// This handles all the exception
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) // This determines the type of error and this is 500
																// server error
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(Model m) {
		m.addAttribute("msg", "Exception occured...");
		return "null_page";
	}

}
