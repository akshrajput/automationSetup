package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.loginPage;

public class login {

	
	public WebDriver driver;
	public loginPage lp;

@Given("^User  open the browser Chrome$")
public void user_open_the_browser_Chrome() throws Throwable {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	lp = new  loginPage(driver);
	
}

@When("^I enters the URL vzw\\.com$")
public void i_enters_the_URL_vzw_com() throws Throwable {
	lp = new  loginPage(driver);
	driver.get("https://secure.verizon.com/vzauth/UI/Login");
	driver.manage().window().maximize();
}

@When("^Enter MDN as \"([^\"]*)\" and password as\"([^\"]*)\"$")
public void enter_MDN_as_and_password_as(String arg1, String arg2) throws Throwable {
  
	lp = new  loginPage(driver);
	lp.enterMdn("4702191603");
	lp.enterPasssword("redlogo1");
}

@When("^click on login button$")
public void click_on_login_button() throws Throwable {
	
	lp = new  loginPage(driver);
	lp.submit();
}


@Then("^IHompage should display welcome sign$")
public void ihompage_should_display_welcome_sign() throws Throwable {
    lp.validateLogin();
	
}

@Then("^close the browser$")
public void close_the_browser() throws Throwable {
   lp.logout();
   
}
}
