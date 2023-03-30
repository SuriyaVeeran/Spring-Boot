package com.demo.sample;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

// @Component
public class Sample_Jsp {

	@RequestMapping("/users")
	public String demo() {

		System.out.println("Sample");

		return "Details.jsp";

	}

}
