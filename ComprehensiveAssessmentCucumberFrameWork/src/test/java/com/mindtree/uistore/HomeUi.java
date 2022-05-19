package com.mindtree.uistore;

import org.openqa.selenium.By;

public class HomeUi {

	public static By lgicon = By.xpath("//span[@class='header-icon-link user-profile-icon']");
	public static By lgclick = By.linkText("Log In");
	public static By find = By.id("search");
	public static By cart = By.id("cart-badge");
	public static By study = By.xpath("//li[@class='topnav_item studyunit']");
	public static By wishlist = By.xpath("//a[@title='Wishlist']");
	public static By beds = By.xpath("//h4[text()='Beds']");
	public static By clkgc = By.xpath("//a[text()=' Gift Cards ']");
	public static By clkshipdelivery = By.xpath("//a[text()='Shipping & Delivery']");
	public static By decor = By.xpath("//li[@class='topnav_item decorunit']");
	public static By aboutus = By.xpath("//a[text()='About Us']");
}
