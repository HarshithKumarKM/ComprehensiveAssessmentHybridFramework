package com.mindtree.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mindtree.pageobject.ExploreBedPage;
import com.mindtree.pageobject.HomePage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

public class TestCase6 extends BaseClass{
	
	HomePage home;
	ExploreBedPage ebp;
	
	@BeforeClass
	public void start() {
        home = new HomePage();
        ebp= new ExploreBedPage();
        
	}
	@Test
	public void explore() throws Exception {
		home.exploreItem();
		Thread.sleep(2000);
		ebp.verifypage();
		Thread.sleep(2000);
		SnapShots.captureScreen(driver, "Explore");
		navigateHome();
}
}