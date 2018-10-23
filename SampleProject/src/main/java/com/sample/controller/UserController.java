package com.sample.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.sample.models.UserMaster;
import com.sample.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService userService  ;
	
	@RequestMapping(value = "/getUserMaster", method = RequestMethod.POST, headers = "Accept=application/json")
	public String getUserMaster(@RequestBody UserMaster userMaster){
		System.out.println("controller");
		System.out.println( userMaster);
		System.out.println(userMaster.getUserid());
		return userService.getUserMaster(userMaster.getUserid());

	}
	@RequestMapping(value = "/userdetailsDelete/{userid}", method = RequestMethod.DELETE, headers = "Accept=application/json" )
	public String deleteUserDetails(@PathVariable("userid") Long userid){
		
		String Value = "";
								
		
		boolean deleteRecord = userService.deleteUserDetails(userid);
		
		if(deleteRecord){
			Value = "Record is deleted succeesfully..";
		}
		
		return  new Gson().toJson(Value);
	}

}
