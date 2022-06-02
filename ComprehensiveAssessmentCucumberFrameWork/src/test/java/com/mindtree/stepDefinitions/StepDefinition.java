package com.mindtree.stepDefinitions;


import com.mindtree.pageobject.CartPage;
import com.mindtree.pageobject.CompareProducts;
import com.mindtree.pageobject.ExploreBedPage;
import com.mindtree.pageobject.FooterAboutUsPage;
import com.mindtree.pageobject.FooterShipDeliveryPage;
import com.mindtree.pageobject.GiftCardPage;
import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.pageobject.SearchPage;
import com.mindtree.pageobject.StudyDropdownPage;
import com.mindtree.pageobject.WishlistPage;
import com.mindtree.utilities.BaseClass;
import com.mindtree.utilities.SnapShots;

import io.cucumber.java.*;
import io.cucumber.java.en.*;



public class StepDefinition  extends BaseClass{
	
	HomePage home;
	LoginPage lg;
	SearchPage se;
	CartPage cart;
	StudyDropdownPage sdp;
	 WishlistPage wp;
	 ExploreBedPage ebp;
	 GiftCardPage gcp;
	 CompareProducts cp;
	 FooterAboutUsPage ap;
	 FooterShipDeliveryPage fsdp;
	 
	@Before
	public void start() {
		setup();
		driver.get(baseUrl);
        home = new HomePage();
        lg = new LoginPage();
        se = new SearchPage();
        cart = new CartPage();
        sdp = new StudyDropdownPage();
        wp = new WishlistPage();
        ebp= new ExploreBedPage();
        gcp = new GiftCardPage();
        cp = new CompareProducts();
        ap = new FooterAboutUsPage();
        fsdp = new FooterShipDeliveryPage();

	}
	
	@After
	public void end() {
		teardown();
	}

	//login
	@Given("^move the mouse on login icon in homepage$")
    public void move_the_mouse_on_login_icon_in_homepage() throws Throwable {
		home.loginicon();
		Thread.sleep(2000);
    }
	 @And("^click on the login and land on loginpage$")
	    public void click_on_the_login_and_land_on_loginpage() throws Throwable {
	    	home.loginclick();
			Thread.sleep(6000);

	    }

    @When("^user enters the (.+) in emailbox$")
    public void user_enters_the_in_emailbox(String email) throws Throwable {
    	lg.enterEmail();
		Thread.sleep(2000);
    }
    
    @And("^enter the (.+) in passwordbox$")
    public void enter_the_in_passwordbox(String password) throws Throwable {
    	lg.enterPassword();
		Thread.sleep(2000);
    }

    @Then("^click on login button$")
    public void click_on_login_button() throws Throwable {
    	lg.clickloginbtn();
		Thread.sleep(2000);
    	
    }

    @And("^Take screenshot$")
    public void take_screenshot() throws Throwable {
    	SnapShots.captureScreen(driver, "Login");

    }
    //Search
    @Given("^Uer should send (.+) to search bar$")
    public void uer_should_send_to_search_bar(String product) throws Throwable {
	 home.searchItem();
		Thread.sleep(2000);
    }

 @And("^click on search icon and navigated to result page$")
    public void click_on_search_icon_and_navigated_to_result_page() throws Throwable {
	 se.searchIcon();
		Thread.sleep(2000);
    }
    @When("^user click on the product it navigated to product details$")
    public void user_click_on_the_product_it_navigated_to_product_details() throws Throwable {
    	se.selectItem();
		Thread.sleep(10000);

    }
    
    @And("^the product should be added to cart$")
    public void the_product_should_be_added_to_cart() throws Throwable {
    	se.AddCart();
		Thread.sleep(2000);
    }


    @Then("^Take sceenshot and navigate back$")
    public void take_sceenshot_and_navigate_back() throws Throwable {
    	SnapShots.captureScreen(driver, "Search");
		navigateHome();
		Thread.sleep(5000);
    }

    //cart
    @Given("^Click on carticon in home page$")
    public void click_on_carticon_in_home_page() throws Throwable {
    	home.cartIcon();
		Thread.sleep(2000);
    }

    @When("^user navigated to cart verify the product present$")
    public void user_navigated_to_cart_verify_the_product_present() throws Throwable {
    	 cart.verifyProduct();
         Thread.sleep(2000);

    }
    
    @And("^remove the added item from the cart$")
    public void remove_the_added_item_from_the_cart() throws Throwable {
    	 cart.removeItem();
    	 Thread.sleep(2000);
    }

    @Then("^take screenshot and navigate back$")
    public void take_screenshot_and_navigate_back() throws Throwable {
    	SnapShots.captureScreen(driver, "cart");
		navigateHome();
    }

    //study
    @Given("^user should hover on the study$")
    public void user_should_hover_on_the_study() throws Throwable {
    	home.studyDropdown();
		Thread.sleep(5000);
    }

    @When("^user should click the item from study dropdown$")
    public void user_should_click_the_item_from_study_dropdown() throws Throwable {
    	sdp.selectItem();
		Thread.sleep(2000);
    }

    @And("^in the result page add the item to wishlist$")
    public void in_the_result_page_add_the_item_to_wishlist() throws Throwable {
    	sdp.addwishlist();
		Thread.sleep(2000);

    }

    @Then("^take screenshot and navigate from study page to home page$")
    public void take_screenshot_and_navigate_from_study_page_to_home_page() throws Throwable {
    	SnapShots.captureScreen(driver, "study");
		navigateHome();

    }
    //wishlist
    
    @Given("^user should click on wishlist icon$")
    public void user_should_click_on_wishlist_icon() throws Throwable {
    	home.wishlistIcon();
		Thread.sleep(2000);
    }

    @When("^user navigated to wishlist verify the product added$")
    public void user_navigated_to_wishlist_verify_the_product_added() throws Throwable {
    	wp.verifyProduct();
		Thread.sleep(2000);
    }

    @And("^remove the added item from wishlist$")
    public void remove_the_added_item_from_wishlist() throws Throwable {
    	wp.remove();
		Thread.sleep(2000);
    }
    @Then("^take screenshot and navigate from wishlist to home page$")
    public void take_screenshot_and_navigate_from_wishlist_to_home_page() throws Throwable {
    	SnapShots.captureScreen(driver, "Wishlist");
		navigateHome();

    }
    //explore products
    @Given("^user should click on beds in explore products section$")
    public void user_should_click_on_beds_in_explore_products_section() throws Throwable {
    	home.exploreItem();
		Thread.sleep(2000);
    }

    @And("^verify it is navigated to page by verifying the text$")
    public void verify_it_is_navigated_to_page_by_verifying_the_text() throws Throwable {
    	ebp.verifypage();
		Thread.sleep(2000);
    }
    
    @Then("^take screenshot and navigate from beds  to home page$")
    public void take_screenshot_and_navigate_from_beds_to_home_page() throws Throwable {
    	SnapShots.captureScreen(driver, "Explore");
		navigateHome();
    }
   //Gift cards
    
    @Given("^click on Gift Cards icon in home page$")
    public void click_on_gift_cards_icon_in_home_page() throws Throwable {
    	home.clickGiftCard();
		Thread.sleep(2000);
    }

    @When("^navigated to result page verify the text present$")
    public void navigated_to_result_page_verify_the_text_present() throws Throwable {
    	gcp.verifyPage();
		Thread.sleep(2000);
    }

    @Then("^take screenshot and navigate from Gift card to home page$")
    public void take_screenshot_and_navigate_from_gift_card_to_home_page() throws Throwable {
    	SnapShots.captureScreen(driver, "GiftCard");
		navigateHome();
    }

   //compare products
    @Given("^click on the Decor dropdown in the homePage$")
    public void click_on_the_decor_dropdown_in_the_homepage() throws Throwable {
    	home.clickValueBuysinDocker();
		Thread.sleep(2000);
    }
    
    @And("^select Wall art from the dropdown$")
    public void select_wall_art_from_the_dropdown() throws Throwable {
    	cp.clickMirror();
		Thread.sleep(2000);
    }

    @When("^it is navigated to the next page hover on product1$")
    public void it_is_navigated_to_the_next_page_hover_on_product1() throws Throwable {
    	cp.product1hover();
		Thread.sleep(2000);
    }
    
    @And("^click on add to compare to add the product1 to compare$")
    public void click_on_add_to_compare_to_add_the_product1_to_compare() throws Throwable {
    	cp.addp1();
		Thread.sleep(2000);
    }

    @Then("^User should hover on the Product2$")
    public void user_should_hover_on_the_product2() throws Throwable {
    	cp.product2hover();
		Thread.sleep(2000);
    }
    
    @And("^add Product2 to add to compare$")
    public void add_product2_to_add_to_compare() throws Throwable {
    	cp.addp2();
		Thread.sleep(2000);
    }

    @And("^click on compare button$")
    public void click_on_compare_button() throws Throwable {
    	cp.clickCompare();
		Thread.sleep(2000);
    }

    @Then("^cpature screenshot and navigate back to home page from wall art page$")
    public void cpature_screenshot_and_navigate_back_to_home_page_from_wall_art_page() throws Throwable {
    	SnapShots.captureScreen(driver, "Compare");
		navigateHome();
    }



    //ABout us
    
    @Given("^User should click on the About us in the footer section$")
    public void user_should_click_on_the_about_us_in_the_footer_section() throws Throwable {
    	home.clickAboutUs();
		Thread.sleep(2000);
    }

    @When("^it is navigated to About us page verify the text in the page$")
    public void it_is_navigated_to_about_us_page_verify_the_text_in_the_page() throws Throwable {
    	ap.verifyPage();
		Thread.sleep(2000);
    }

    @Then("^take snapshot of the About us page and navigate back to the home page$")
    public void take_snapshot_of_the_about_us_page_and_navigate_back_to_the_home_page() throws Throwable {
    	SnapShots.captureScreen(driver, "AboutUs");
		navigateHome();

    }


  //shipping and delivery
    
    
    
    @Given("^click on the shipping & delivery in the footer$")
    public void click_on_the_shipping_delivery_in_the_footer() throws Throwable {
    	home.clickShippingandDelivery();;
		Thread.sleep(2000);
    }

    @When("^navigated to shipping and delivery page verify the text$")
    public void navigated_to_shipping_and_delivery_page_verify_the_text() throws Throwable {
    	fsdp.verifyPageShipDelivery();
		Thread.sleep(2000);
    }

    @Then("^capture screenshot and navigate from shipping page to home page$")
    public void capture_screenshot_and_navigate_from_shipping_page_to_home_page() throws Throwable {
    	SnapShots.captureScreen(driver, "ShippingAndDelivery");
		navigateBack();
    }

   


   



   

}
