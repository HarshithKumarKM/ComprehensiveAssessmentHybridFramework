package com.mindtree.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mindtree.pageobject.CompareProducts;
import com.mindtree.pageobject.HomePage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

public class TestCase8 extends BaseClass{
	
	HomePage home;
	CompareProducts cp;
	
	@BeforeClass
	public void start() {
		
        home = new HomePage();
       cp = new CompareProducts();
        
	}
	@Test
	public void compare() throws Exception {

		home.clickValueBuysinDocker();
		Thread.sleep(2000);
		cp.clickMirror();
		Thread.sleep(2000);
		cp.product1hover();
		Thread.sleep(2000);
		cp.addp1();
		Thread.sleep(2000);
		cp.product2hover();
		Thread.sleep(2000);
		cp.addp2();
		Thread.sleep(2000);
		cp.clickCompare();
		Thread.sleep(2000);
		SnapShots.captureScreen(driver, "Compare");
		navigateHome();
		
		

}
}