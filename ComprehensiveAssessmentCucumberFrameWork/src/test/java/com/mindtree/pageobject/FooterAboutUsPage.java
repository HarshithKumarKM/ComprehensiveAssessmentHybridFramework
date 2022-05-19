package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.AboutUi;
import com.mindtree.utilities.CreateLog;

public class FooterAboutUsPage {
	

	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public FooterAboutUsPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void verifyPage() {
		String text = helper.getText(AboutUi.verifyText);
		if(text.equals("Our Values")) {
			log.info("Successfully verified About Us page");
		}
		else {
			log.info("Failed to verify About us  page");
		}
	}

}
