package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class ProductPage {
	
	@FindBy (xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div[1]/article/div/div[2]/h2/a")
	WebElement productname;
	
	public ProductPage () {
		
		PageFactory.initElements(Config.driver,this);
	}
	
	public String verifProduct () {
		
		String actualmessage= productname.getText();
		return actualmessage;
		
	}

}
