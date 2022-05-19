package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.HomeUi;
import com.mindtree.utilities.CreateLog;

public class HomePage {

	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public HomePage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void loginicon() {
		helper.hover(HomeUi.lgicon);
		log.info("Successfully Hovered on login");
	}
	
	public void loginclick() {
		helper.clckOn(HomeUi.lgclick);
		log.info("Successfully clicked on login");
	}
	public void searchItem() {
		
		helper.sendText(HomeUi.find, "Sofa");
		log.info("Successfully sent text into search bar");
	}
	
	public void cartIcon() {
		helper.clckOn(HomeUi.cart);
		log.info("successfully clicked on cart icon");
	}
	public void studyDropdown() {
		helper.hover(HomeUi.study);
		log.info("Successfully Hovered on studys section in HomePage");
	}
	public void wishlistIcon() {
		helper.clckOn(HomeUi.wishlist);
		log.info("Successfully clicked on wishlistIcon");
	}
	public void exploreItem() {
		helper.clckOn(HomeUi.beds);
		log.info("Successfully clicked on beds in explore section");
	}
	public void clickGiftCard() {
		helper.clckOn(HomeUi.clkgc);
		log.info("Succefully clicked on GiftCards");
	}
	public void clickShippingandDelivery() {
		helper.clckOn(HomeUi.clkshipdelivery);
		log.info("Succefully clicked on Ship and Delivery");
	}
	
	public void clickValueBuysinDocker() {
		helper.clckOn(HomeUi.decor);
		log.info("Successfully clicked docker section");
	}
	public void clickAboutUs() {
		helper.clckOn(HomeUi.aboutus);
		log.info("Successfully clicked on About Us");
	}
}
