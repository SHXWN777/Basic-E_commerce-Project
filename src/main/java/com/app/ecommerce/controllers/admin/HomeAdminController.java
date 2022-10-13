package com.app.ecommerce.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeAdminController {
	
	@RequestMapping("/HomeAdmin")
	public String Home() {
		return "admin/HomeAdmin";
	}
	
	

}
