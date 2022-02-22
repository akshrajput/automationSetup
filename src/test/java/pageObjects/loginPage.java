package pageObjects;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public WebDriver Driver;

	public loginPage(WebDriver driver) {

		Driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "IDToken1")
	@CacheLookup
	WebElement mdn;

	@FindBy(id = "IDToken2")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "(//*[@type='submit'])[1]")
	@CacheLookup
	WebElement submit;

	@FindBy(xpath = "//*[@class='StyledTypography-sc-5k55co-0 faksWo StyledTitle-sc-155xzr0-0 cnfBSC']")
	@CacheLookup
	WebElement welcomemessage;

	@FindBy(xpath = "//*[@data-menuitem='vzmobilemenu']")
	@CacheLookup
	WebElement menu;

	@FindBy(xpath = "((//*[contains(text(),'Sign out')])[7]")
	@CacheLookup
	WebElement signout;

	public void enterMdn(String MDN) {
		mdn.clear();
		mdn.sendKeys(MDN);
	}

	public void enterPasssword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void submit() {

		submit.click();
	}

	public void validateLogin() throws InterruptedException {
		Thread.sleep(8000);
		if (welcomemessage.isDisplayed()) {
			if (welcomemessage.getText().trim().contains("Welcome")) {
				//Assert.assertTrue(true);
			} else {
				Driver.close();
			}

		}
	}

	public void logout() throws InterruptedException {
		
		try{
			
			Thread.sleep(200);
			signout.click();
			Thread.sleep(200);
			Driver.close();
		}
		catch(Exception e)
		{Driver.close();
			
		}
		
		

	}
}
