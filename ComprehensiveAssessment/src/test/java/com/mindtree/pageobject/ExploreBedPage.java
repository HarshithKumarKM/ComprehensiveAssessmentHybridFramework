package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.BedUi;
import com.mindtree.utilities.CreateLog;

public class ExploreBedPage {
	
	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public ExploreBedPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void verifypage() {
		String text = helper.getText(BedUi.text);
		System.out.println(text);
		if(text.equals("Beds")) {
			log.info("Text is successfully verified in the explore section");
		}
		else {
			log.info("Text Missmatch");
		}
	}

}
