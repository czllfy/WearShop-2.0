/**
 * 
 */
package com.wearshop.web.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.ui.ModelMap;

/**
 * @author rvo
 *
 */
public class HelloControllerTest {
	@Test
	public void testHandleRequestView() throws Exception {
        HelloController controller = new HelloController();
        String view = controller.handleRequest(new ModelMap());
        assertEquals("hello", view);
    }
}