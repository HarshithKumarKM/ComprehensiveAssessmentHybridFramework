package com.mindtree.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.WishlistPage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

public class TestCase5 extends BaseClass{
	
	HomePage home;
    WishlistPage wp;
    
	
	@BeforeClass
	public void start() {
        home = new HomePage();
        wp = new WishlistPage();
       
	}
	@Test
	public void wishlist() throws Exception {
		home.wishlistIcon();
		Thread.sleep(2000);
		wp.verifyProduct();
		Thread.sleep(2000);
		wp.remove();
		Thread.sleep(2000);
		SnapShots.captureScreen(driver, "Wishlist");
		navigateHome();
		
}
}
