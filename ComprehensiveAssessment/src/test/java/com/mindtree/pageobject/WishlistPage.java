package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.WishlistUi;
import com.mindtree.utilities.CreateLog;

public class WishlistPage {

	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public WishlistPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void verifyProduct() {
		String text = helper.getText(WishlistUi.item);
		System.out.println(text);
		if(text.equals("Larsson Study Table")) {
			log.info("Item successfully verified in the wishlist");
		}
		else {
			log.info("Item is not present in wishlist");
		}
	}
	
	public void remove() {
		helper.clckOn(WishlistUi.remove);
		log.info("Successfully removed item from wishlist");
	}
}
