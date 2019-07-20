package com.example.demo.commontypes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class AppBeanTests {
	@Test
	public void assertThatTest() {
		AppBean appBean = new AppBean();
		appBean.name = "test";
		appBean.words = "ssssss";
		assertThat(appBean.name).isEqualTo("test");
		assertThat(appBean.words).isEqualTo("ssssss");

	}
}
