package com.app.ecommerce.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
	
	@RequestMapping("/Accueil")
	public String Accueil() {
		return "pages_web/Accueil";
	}
	
	//@RequestMapping(value = "process1", method = RequestMethod.POST)
	//public String process1() {
	//	return "redirect:/pages_web/About";
	//}
	
	
	//@RequestMapping("/About")
	//public String About() {
		//return "About";
	//}

}
