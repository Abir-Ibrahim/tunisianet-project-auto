package pages;



import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Config;

public class DisqueSSDPage {
	
	@FindBy (xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List<WebElement> productlist;
	
	@FindBy (xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div[2]/article/div/div[4]/div[4]/span")
	WebElement availability;
	
	@FindBy (xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[4]/form/div[2]/div/div[2]/button")
	WebElement addtocartBTN;
	
	@FindBy (xpath="/html/body/div[8]/div/div/div/div[2]/div/div/a")
	WebElement orderBTN;
	
	public DisqueSSDPage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void productAvailability (String productname ) throws Exception {
		Thread.sleep(5000);
		try {
		for (WebElement product:productlist) {
	
		if(product.getText().contains(productname)) {
			Assert.assertTrue(availability.getText().equals("En stock"));
			product.click();
		
		}
		
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
	
	
	public void order () {
		WebDriverWait wait= new WebDriverWait(Config.driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addtocartBTN));
		addtocartBTN.click();
		Config.attente(10);
		orderBTN.click();	
	}
	
	
}
