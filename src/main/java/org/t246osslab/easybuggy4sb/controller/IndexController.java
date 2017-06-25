package org.t246osslab.easybuggy4sb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value = "/")
	public ModelAndView init(HttpSession ses, ModelAndView mav) {
		ses.removeAttribute("dlpinit");
		mav.setViewName("index");
		mav.addObject("title", "EasyBuggy");
		return mav;
	}
}