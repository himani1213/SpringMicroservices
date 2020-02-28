package com.micro.ibm.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductMVCController {

	@RequestMapping("hello")
	public String getDefaultView(Model model) {
		// model.addAttribute("name","MS");
		return "home";
	}

}
