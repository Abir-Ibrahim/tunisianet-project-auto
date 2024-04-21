package testsuites;

import org.junit.Assert;

import helper.Config;
import helper.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ItemsPage;
import pages.Productsearch;

public class SearchTestsuite {
	
	@Given("user is on homepage")
	public void user_is_on_homepage() throws Exception {
		Config.chonfchrome();
		Config.maximizewindow();
		Config.driver.get(Utils.getProprety("Web_portal_link3"));
	}

	@When("user enter prodct name in the search bar {string} and clicks on search")
	public void user_enter_prodct_name_in_the_search_bar_and_clicks_on_search(String itemSearch) {
		Productsearch search= new Productsearch(); 
		search.enterProductName(itemSearch);
	}

	@Then("user is directed to the products page that contains {string}")
	public void user_is_directed_to_the_products_page_that_contains(String expectedmessage) throws Exception {
		ItemsPage page= new ItemsPage();
		String actualmessage=page.verifi();
		Assert.assertEquals(expectedmessage, actualmessage);
	}

}
