package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.CompareProductsUi;
import com.mindtree.utilities.CreateLog;

public class CompareProducts {
	
	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public CompareProducts() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}

	public void clickMirror() {
		helper.clckOn(CompareProductsUi.mirror);
		log.info("Successfully clicked on wall art in decor dropdown ");
	}
	
	public void product1hover() {
		helper.hover(CompareProductsUi.product1);
		log.info("Successfully hovered on product1");
	}
	public void addp1() {
		helper.clckOn(CompareProductsUi.addcomparep1);
		log.info("Successfully added product1 to compare");
	}
	public void product2hover() {
		helper.hover(CompareProductsUi.product2);
		log.info("Successfully hovered on product2");
	}
	public void addp2() {
		helper.clckOn(CompareProductsUi.addcomparep2);
		log.info("Successfully added product1 to compare");
	}
	
	public void clickCompare() {
		helper.clckOn(CompareProductsUi.clickCompare);
		log.info("Sucessfully compared two products");
	}
}
