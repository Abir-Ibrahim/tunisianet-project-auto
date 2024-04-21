package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class homePage {
	
	@FindBy (xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement> menus;
	
	@FindBy (xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[5]/div[2]/div/div/ul/li[2]/a")
	List<WebElement> submenus;
	
	public homePage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void  moushoverOnMenu (String menutitle) {
		try {
		for (WebElement menu:menus) {
			if(menu.getText().contains(menutitle)) {
				Config.actions= new Actions (Config.driver);
				Config.actions.moveToElement(menu).perform();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void clickOnSubmenu (String submenutitle) throws Exception {
		Thread.sleep(5000);
		try {
		for (WebElement submenu:submenus) {
			if(submenu.getText().contains(submenutitle)) {
				submenu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
