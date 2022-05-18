package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.SearchUi;
import com.mindtree.utilities.CreateLog;

public class SearchPage {

	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public SearchPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void searchIcon() {
		helper.clckOn(SearchUi.icon);
		log.info("Successfully clicked on search icon and navigated to result page");
	}
	public void selectItem() {
		helper.clckOn(SearchUi.select);
		log.info("Successfully selected the item");
	}
	
	public void AddCart() {
		helper.clckOn(SearchUi.addToCart);
		log.info("item added to cart");
		
	}
}
