/**
 * 
 */
package com.wearshop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author roman
 *
 */
@Controller
public class HelloController {
	
	@RequestMapping("/hello.html")
	public String handleRequest(ModelMap model) {
        model.addAttribute("message", "HELLO my friend!!!");
        return "hello";
    }

}
