package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class ShoppingCartPage {
	
	@FindBy (xpath="/html/body/main/section/div/div/div/section/div/div/div[1]/div[2]/ul/li[2]/div/div[2]/div[1]/a")
	WebElement verifProduct;
	
	public ShoppingCartPage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verif() {
		
		String actualmessage=verifProduct.getText();
		 return actualmessage;
	}
}
