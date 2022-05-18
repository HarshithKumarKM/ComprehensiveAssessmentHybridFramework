package com.mindtree.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mindtree.pageobject.GiftCardPage;
import com.mindtree.pageobject.HomePage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

public class TestCase7 extends BaseClass{
	
	HomePage home;
	GiftCardPage gcp;
	
	@BeforeClass
	public void start() {
        home = new HomePage();
        gcp = new GiftCardPage();
        
	}
	@Test
	public void giftcards() throws Exception {
   
		home.clickGiftCard();
		Thread.sleep(2000);
		gcp.verifyPage();
		Thread.sleep(2000);
		SnapShots.captureScreen(driver, "GiftCard");
		navigateHome();
}
}