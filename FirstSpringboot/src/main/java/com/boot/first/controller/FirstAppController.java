package com.boot.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstAppController {

	@RequestMapping(value = "/helth", method = RequestMethod.GET)
	public String helth() {
		return "up";
	}

}
