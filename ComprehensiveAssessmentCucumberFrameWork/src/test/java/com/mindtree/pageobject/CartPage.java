package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.CartUi;
import com.mindtree.utilities.CreateLog;

public class CartPage {
	
	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public CartPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void verifyProduct() {
		
		String text = helper.getText(CartUi.product);
		if(text.equals("Weston Half Leather Sofa")) {
			log.info("Item successfully verified in the cart");
		}
		else {
			log.info("Item is not added to cart");
		}	
	}
	
	public void removeItem() {
		
		helper.clckOn(CartUi.cancel);
		log.info("Successfully Removed item from the cart ");
	}

}
