package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class ItemsPage {
	
	@FindBy (xpath="/html/body/main/section/div/div/div[2]/section/p")
	WebElement verifSentence;

	public ItemsPage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifi () throws Exception {
		Thread.sleep(1000);
		String actualmessage=verifSentence.getText();
		return actualmessage;
	}
}
