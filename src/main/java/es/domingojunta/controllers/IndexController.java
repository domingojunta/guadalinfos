package es.domingojunta.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@CrossOrigin(origins="*")
public class IndexController {

	
	
			
	@GetMapping({"/home","/"})
	public String home(Model model) {
		
		
		return "index";
	}
	
	
}
