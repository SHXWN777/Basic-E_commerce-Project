package com.app.ecommerce.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyaccountController {
	
	
	@RequestMapping("/Myaccount")
	public String Myaccount() {
		return "pages_web/Myaccount";
	}


}
