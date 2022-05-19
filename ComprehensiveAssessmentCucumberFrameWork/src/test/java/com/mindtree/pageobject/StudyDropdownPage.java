package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.StduyDropdownUi;
import com.mindtree.utilities.CreateLog;

public class StudyDropdownPage {


	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public StudyDropdownPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void selectItem() {
		helper.clckOn(StduyDropdownUi.computerTable);
		log.info("Successfully clicked on studytable");
	}
	public void addwishlist() {
		helper.clckOn(StduyDropdownUi.addwl);
		log.info("added to wishlist");
	}
}
