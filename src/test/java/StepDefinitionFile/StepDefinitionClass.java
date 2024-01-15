package StepDefinitionFile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.github.dockerjava.api.model.Driver;

import PageObjectFile.LogOut;
import PageObjectFile.LoginClass;
import io.cucumber.java.en.*;
import jdk.internal.org.jline.utils.Log;

public class StepDefinitionClass extends BaseClass

{
	
	@Given("user launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
	  driver=new ChromeDriver();
	  lg=new LoginClass(driver);
	  //lo=LogOut(driver);
	}

	@When("user open Url {string}")
	public void user_open_url(String url) 
	{
	    driver.get(url);
	}

	@When("user enter username {string} and password as {string}")
	public void user_enter_username_and_password_as(String user, String pass) 
	{
		lg.user_name(user);
		lg.user_Pass(pass);
	    
	}

	@When("click on submit_button")
	public void click_on_submit_button() 
	{
	    lg.user_sub();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	    
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() {
	    
	}

	@When("close browser")
	public void close_browser() {
	    
	}

	
		
	
}
