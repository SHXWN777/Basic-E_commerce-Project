 package com.app.ecommerce.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.ecommerce.model.Client;
import com.app.ecommerce.services.ClientService;

@Controller
public class LoginController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping("/Register")
	public String Register() {
		return "login/Register";
	}
	
	@PostMapping("/saveClient")
	public String saveClient(@ModelAttribute("Client") Client client) {
		clientService.saveClient(client);
		return "pages_web/Accueil";
	}
	
	
	
//	@RequestMapping("/Register")
//	public String Register(Model model) {
//		model.addAttribute("client", new Client());
//		return "login/Register";
//	}
//	
//	@RequestMapping("/Sign_in")
//	public String Sign_in(Model model) {
//		model.addAttribute("client", new Client());
//		return "login/Sign_in";
//	}
		
	//@RequestMapping(value = "process", method = RequestMethod.POST)
	//public String process() {
    //	model.addAttribute("client", new Client());
	//	return "redirect:Accueil";
	//}
	
	
	//@PostMapping("/Inscription")
	//public String Inscription(Client client) {
	//	repo.save(client);
	//	return "Accueil";
	//}
	
	
	
}
