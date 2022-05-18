package com.mindtree.testcases;

import org.testng.annotations.*;

import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.SearchPage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

public class TestCase2 extends BaseClass{
	
	HomePage home;
	SearchPage se;
	
	@BeforeClass
	public void start() {
		
        home = new HomePage();
        se = new SearchPage();
	}
	@Test
	public void search() throws Exception {
		home.searchItem();
		Thread.sleep(2000);
		se.searchIcon();
		Thread.sleep(2000);
		se.selectItem();
		Thread.sleep(10000);
		se.AddCart();
		Thread.sleep(2000);
		SnapShots.captureScreen(driver, "Search");
		navigateHome();
		Thread.sleep(5000);
		
	}


}
