package com.example.demo.services.impl;

import org.springframework.stereotype.Service;

import com.example.demo.commontypes.AppBean;
import com.example.demo.services.AppService;

@Service("appService")
public class AppServiceImpl implements AppService {

	@Override
	public AppBean helloApp(String name) {
		AppBean bean = new AppBean();
		bean.name = name;
		bean.words = "hello!";
		return bean;
	}

}
