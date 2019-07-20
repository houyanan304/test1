package com.example.demo.services.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.demo.commontypes.AppBean;
import com.example.demo.services.AppService;

public class AppServiceImplTest {
	public AppService appServiceImpl;

	@Before
	public void setUp() {
		appServiceImpl = new AppServiceImpl();
	}

	@Test
	public void testHelloApp() {
		AppBean result = appServiceImpl.helloApp("test");
		assertThat(result.name).isEqualTo("test");
		assertThat(result.words).isEqualTo("hello!");
	}

	@After
	public void end() {

	}
}
