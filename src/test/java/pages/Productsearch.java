package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class Productsearch {
	
	@FindBy (xpath="/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/input[4]")
	WebElement searchbar;
	
	
	public Productsearch() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterProductName (String itemSearch) {
		searchbar.sendKeys(itemSearch+Keys.ENTER);
		
		
	}

}
