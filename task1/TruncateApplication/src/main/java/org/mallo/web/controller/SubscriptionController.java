package org.mallo.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.mallo.web.util.TruncateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Mohamed Asimulla S
 * @version 0.1
 */
@Controller
public class SubscriptionController 
{	
	@RequestMapping(value="/subscribe", method = RequestMethod.GET)
	public String subscribe(HttpServletRequest request) {
		String VIEW = "subscription.html";
				
		String orderDetails = getOrderDetails(request);
		String truncatedOrderDetails = truncate(orderDetails, 250);
        log(truncatedOrderDetails);
		
		return VIEW;
	}
	
		

	private String truncate(String orderDetails, int maxLen) {
		return TruncateUtil.truncate(orderDetails, maxLen);
	}
	

	private String getOrderDetails(HttpServletRequest request) {
		return "";
	}
		

	private void log(String message) {		
	}
}
