package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.FooterShipDeliveryUi;
import com.mindtree.utilities.CreateLog;

public class FooterShipDeliveryPage {

	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public FooterShipDeliveryPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}

	public void verifyPageShipDelivery() {
		String text = helper.getText(FooterShipDeliveryUi.verifyText);
		if(text.equals("Policy")) {
			log.info("Successfully verified ship and delivery page");
		}
		else {
			log.info("Failed verified ship and delivery page");
		}	
	}
}
