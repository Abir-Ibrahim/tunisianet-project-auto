package testsuites;

import org.junit.Assert;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;
import pages.homePage;

public class HomePageTestsuite {
	
	@Given("user is on homePage")
	public void user_is_on_home_page() throws Exception {
		
		Config.chonfchrome();
		Config.maximizewindow();
		String url="https://www.tunisianet.com.tn/";
		Config.driver.get(url);
		    
	}

	@When("user moushover menu {string}")
	public void user_moushover_menu(String menutitle) {
		homePage page= new homePage();
		page.moushoverOnMenu(menutitle);
	    
	}

	@When("click on submenu {string}")
	public void click_on_submenu(String submenutitle) throws Exception {
		homePage page= new homePage();
		page.clickOnSubmenu(submenutitle);
	    
	}

	@Then("user is directed to submenu page that contains this product {string}")
	public void user_is_directed_to_submenu_page_that_contains_this_product(String expectedmessage) {
		
		ProductPage product= new ProductPage();
		String actualmessage= product.verifProduct();
		Assert.assertEquals(expectedmessage, actualmessage);
		
	 
	}

}
