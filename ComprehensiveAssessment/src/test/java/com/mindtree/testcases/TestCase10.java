package com.mindtree.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mindtree.pageobject.FooterShipDeliveryPage;
import com.mindtree.pageobject.HomePage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

public class TestCase10 extends BaseClass{
	
	HomePage home;
	FooterShipDeliveryPage fsdp;
	
	@BeforeClass
	public void start() {
		
        home = new HomePage();
        fsdp = new FooterShipDeliveryPage();
	}
	@Test
	public void shipDelivery() throws Exception {
   
		home.clickShippingandDelivery();;
		Thread.sleep(2000);
		fsdp.verifyPageShipDelivery();
		Thread.sleep(2000);
		SnapShots.captureScreen(driver, "ShippingAndDelivery");
		navigateBack();
}

}
