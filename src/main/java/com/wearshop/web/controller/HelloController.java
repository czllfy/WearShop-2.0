/**
 * 
 */
package com.wearshop.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application 'hello' page.
 * 
 * @author rvo
 *
 */
@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	protected final Logger log = Logger.getLogger(getClass());
	
	@RequestMapping(value = "/hello.html", method = RequestMethod.GET)
	public String handleRequest(ModelMap model) {
		log.info("Returning hello view");
        model.addAttribute("message", "HELLO HERE!");
        return "hello";
    }

}
