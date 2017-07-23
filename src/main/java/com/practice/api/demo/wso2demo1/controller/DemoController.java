/**
 * 
 */
package com.practice.api.demo.wso2demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.api.demo.wso2demo1.model.DemoModelResponse;


@RestController
public class DemoController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/wso2demo1/getDemoHealth", produces = "application/json", consumes = "application/json")
	public DemoModelResponse getDemoHealth() {
		DemoModelResponse health = new DemoModelResponse("RUNNING");
		return health;
	}
	
}
