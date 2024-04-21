package testsuites;

import org.junit.Assert;

import helper.Config;
import helper.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.DisqueSSDPage;
import pages.ShoppingCartPage;

public class DisqueSSDtestsuite {
	
	@Given("user is on disqueSSD page")
	public void user_is_on_disque_ssd_page() throws Exception {
		
		Config.chonfchrome();
		Config.maximizewindow();
		Config.driver.get(Utils.getProprety("Web_portal_link2"));
	  
	}

	@When("user checks if the product {string} is available and clicks on the product")
	public void user_checks_if_the_product_is_available_and_clicks_on_the_product(String productname) throws Exception {
		DisqueSSDPage page= new DisqueSSDPage();
		page.productAvailability(productname);
	}

	@Then("user order the product {string}")
	public void user_order_the_product(String string) {
		DisqueSSDPage page= new DisqueSSDPage();
		page.order();
	}

	@Then("user is directed to the shopping cart that contains {string}")
	public void user_is_directed_to_the_shopping_cart_that_contains(String expectedmessage) {
		ShoppingCartPage cart= new ShoppingCartPage();
		String actualmessage=cart.verif();
		Assert.assertEquals(expectedmessage, actualmessage);
	}


}
