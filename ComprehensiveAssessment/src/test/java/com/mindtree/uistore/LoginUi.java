package com.mindtree.uistore;

import org.openqa.selenium.By;

public class LoginUi {
	
	public static By email = By.xpath("//input[@autofocus='autofocus']");
	public static By password = By.xpath("//form[@name='login_form']/descendant::input[@type='password']");
	public static By lgbtn = By.id("ul_site_login");

}
