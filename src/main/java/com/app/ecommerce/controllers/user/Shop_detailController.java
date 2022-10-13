package com.app.ecommerce.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Shop_detailController {
	
	@RequestMapping("/Shop_detail")
	public String Shop_detail() {
		return "pages_web/Shop_detail";
	}


}
