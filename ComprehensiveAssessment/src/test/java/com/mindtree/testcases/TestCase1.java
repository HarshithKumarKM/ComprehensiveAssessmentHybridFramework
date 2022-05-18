package com.mindtree.testcases;


import org.testng.annotations.*;

import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

public class TestCase1 extends BaseClass{
	
	HomePage home;
	LoginPage lg;
	
	@BeforeTest
	public void start() {
		setup();
		driver.get(baseUrl);
        home = new HomePage();
        lg = new LoginPage();
       
	}
	@Test
	public void Login() throws Exception {
		
		home.loginicon();
		Thread.sleep(2000);
		home.loginclick();
		Thread.sleep(6000);
		lg.enterEmail();
		Thread.sleep(2000);
		lg.enterPassword();
		Thread.sleep(2000);
		lg.clickloginbtn();
		Thread.sleep(2000);
		SnapShots.captureScreen(driver, "Login");
		
		
	}

	@AfterTest
	public void end() {
		teardown();
	}

}
