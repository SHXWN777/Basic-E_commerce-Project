package com.app.ecommerce.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PanierController {
	
	@RequestMapping("/Panier")
	public String Panier() {
		return "pages_web/Panier";
	}

}
