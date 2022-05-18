package com.mindtree.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.StudyDropdownPage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;


public class TestCase4 extends BaseClass{
	
	HomePage home;
	StudyDropdownPage sdp;
	
	@BeforeClass
	public void start() {
	
        home = new HomePage();
        sdp = new StudyDropdownPage();
        
	}
	@Test
	public void study() throws Exception {
		
		home.studyDropdown();
		Thread.sleep(5000);
		sdp.selectItem();
		Thread.sleep(2000);
		sdp.addwishlist();
		Thread.sleep(2000);
		SnapShots.captureScreen(driver, "study");
		navigateHome();
		

}
}
