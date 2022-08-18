package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

	private WebDriver driver;
	private By welcomeMsg = By.id("WelcomeContent");
	
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getWelcomeMsg() {
		return driver.findElement(welcomeMsg).getText();
	}
}
