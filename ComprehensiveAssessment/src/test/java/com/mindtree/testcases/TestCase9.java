package com.mindtree.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mindtree.pageobject.FooterAboutUsPage;
import com.mindtree.pageobject.HomePage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

public class TestCase9 extends BaseClass{
	
	HomePage home;
	FooterAboutUsPage ap;
	
	@BeforeClass
	public void start() {
        home = new HomePage();
        ap = new FooterAboutUsPage();
       
        
	}
	@Test
	public void aboutus() throws Exception {
		
		home.clickAboutUs();
		Thread.sleep(2000);
		ap.verifyPage();
		Thread.sleep(2000);
		SnapShots.captureScreen(driver, "AboutUs");
		navigateHome();
		
		

}
}