package com.mindtree.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mindtree.pageobject.CartPage;
import com.mindtree.pageobject.HomePage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

public class TestCase3 extends BaseClass{
	
	HomePage home;
	CartPage cart;
	
	@BeforeClass
	public void start() {
        home = new HomePage();
        cart = new CartPage();
        
	}
	@Test
	public void cart() throws Exception {
		
		home.cartIcon();
		Thread.sleep(2000);
        cart.verifyProduct();
        Thread.sleep(2000);
        cart.removeItem();
		SnapShots.captureScreen(driver, "cart");
		navigateHome();


}
}
