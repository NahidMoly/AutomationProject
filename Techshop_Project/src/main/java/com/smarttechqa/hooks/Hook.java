package com.smarttechqa.hooks;

import com.smarttechqa.basepage.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {
	@Before
	public static void initializa() {
		BaseClass.setUp();
		
	}
	
	//teardown will quit the browser after every scenario
	@After
	public static void tearDown() {
		driver.quit();
	}

}
