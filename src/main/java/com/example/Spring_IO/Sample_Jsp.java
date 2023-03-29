package com.example.Spring_IO;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/users")
public class Sample_Jsp {

	public String demo() {

		System.out.println("Sample");

		return "Details.jsp";

	}

}
