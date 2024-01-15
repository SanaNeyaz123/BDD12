package StepDefinitionFile;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import PageObjectFile.LogOut;
import PageObjectFile.LoginClass;


public class BaseClass {

	public WebDriver driver;
	public LoginClass lg;
	public LogOut lo; 
	public static Logger Log;
}
