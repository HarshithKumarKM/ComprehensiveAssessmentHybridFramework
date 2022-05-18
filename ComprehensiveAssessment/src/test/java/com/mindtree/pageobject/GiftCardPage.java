package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.GiftCardUi;
import com.mindtree.utilities.CreateLog;

public class GiftCardPage {
	
	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public GiftCardPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void verifyPage() {
		
		String text = helper.getText(GiftCardUi.giftText);
		if(text.equals("Gift Cards")) {
			log.info("Successfully verified gift card page");
		}
		else {
			log.info("Failed verified Gift card page");
		}	
	}
	

}
