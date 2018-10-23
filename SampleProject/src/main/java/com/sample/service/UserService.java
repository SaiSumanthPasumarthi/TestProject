package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.sample.dao.UserDao;
//import com.sample.models.CustomResponseBean;
import com.sample.models.UserMaster;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public String getUserMaster(Long userid) {
		UserMaster userMaster = userDao.getUserMaster(userid);
		System.out.println("Service");
		System.out.println( userMaster);
		if(userMaster == null){
			//return new Gson().toJson(new CustomResponseBean(0, "No Data found"));
			return new Gson().toJson("nodata found");
		}else{
			
			return new Gson().toJson(userMaster);
		}
	}
	public boolean deleteUserDetails(Long userid){
		return userDao.deleteUserDetails(userid);
	}
}
