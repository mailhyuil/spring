package com.callor.images.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		log.debug("HOME");
		return "home";
<<<<<<< HEAD
	}	
=======
	}

	
	
>>>>>>> fe74c4c98396f8694bf1545e993fe0cda96341bc
}
