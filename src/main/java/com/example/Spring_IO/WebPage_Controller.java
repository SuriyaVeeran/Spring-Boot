package com.example.Spring_IO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Component
@Controller
public class WebPage_Controller {

	// with help of model and view
	@RequestMapping(value = "/portals", method = RequestMethod.GET)
	public ModelAndView portal_Data(@RequestParam("pagename") String pagename) {

		System.out.println("pagename  : " + pagename);

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("pagename", pagename);

		modelAndView.setViewName("details");

		return modelAndView;

	}

//	// with help of session
//	@RequestMapping(value = "/portals", method = RequestMethod.GET)
//	public String portal_Data(HttpSession session, String pagename) {
//
//		session.setAttribute("pagename", pagename);
//		System.out.println("pagename : " + pagename);
//
//		return "details";
//
//	}

//	// with help of request
//	
//	@RequestMapping(value = "/portals", method = RequestMethod.GET)
//	public String portal_Data(HttpServletRequest req) {
//
//		HttpSession session = req.getSession();
//
//		String pagename = req.getParameter("pagename");
//		session.setAttribute("pagename", pagename);
//		System.out.println("pagename : " + pagename);
//
//		return "details";
//
//	}

}
