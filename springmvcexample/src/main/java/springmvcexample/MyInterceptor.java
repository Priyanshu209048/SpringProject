package springmvcexample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//public class MyInterceptor implements HandlerInterceptor {
//}

public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("This is Prehandler...");
		
		String name = request.getParameter("user");
		if (name.startsWith("p")) {
			response.setContentType("text/html");
			response.getWriter().println("<h1>Invalid name... name should not starts with p<h1>");
			return false;
		}
		
		return true;
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("This is Post handler");
		String name = request.getParameter("user");
		modelAndView.addObject("name", name+" Baral");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("This is after completion");
		
	}
	
	
	
}

