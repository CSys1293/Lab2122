package com.sysling.spring1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/enroll", method = RequestMethod.POST)
	public String enroll(Model model,
			HttpServletRequest request) {
		
		String[] classes = request.getParameterValues("classes");
		
		System.out.println(request.getQueryString());
		//user info
		model.addAttribute("fn",request.getParameter("firstName"));
		model.addAttribute("ln",request.getParameter("lastName"));
		model.addAttribute("ag",request.getParameter("age"));
		model.addAttribute("ad",request.getParameter("address"));
		model.addAttribute("em",request.getParameter("email"));
		//class selection
		model.addAttribute("cl", classes);
		
		return "home";
	}
	
}
