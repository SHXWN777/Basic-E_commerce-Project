package com.app.ecommerce.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FavorisController {
	
	
	@RequestMapping("/Favoris")
	public String Favoris() {
		return "pages_web/Favoris";
	}


}
