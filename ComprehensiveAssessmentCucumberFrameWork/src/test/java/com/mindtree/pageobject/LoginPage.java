package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.LoginUi;
import com.mindtree.utilities.CreateLog;

public class LoginPage {


	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public LoginPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void enterEmail() {
		helper.sendText(LoginUi.email,"harshithkrnagar0000@gmail.com");
		log.info("Successfully enterd email");
	}
	public void enterPassword() {
		helper.sendText(LoginUi.password, "Pa##w0rd");
		log.info("Successfully enterd password");
	}
	public void clickloginbtn() {
		helper.clckOn(LoginUi.lgbtn);
		log.info("Successfully clicked on login");
	}
}
