package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	private By username = By.name("username");
	private By password = By.name("password");
	private By signin = By.name("signon");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		WebElement pwdField = driver.findElement(password);
		pwdField.clear();
		pwdField.sendKeys(pwd);
	}

	public WelcomePage clickSingIn() {
		driver.findElement(signin).click();
		return new WelcomePage(driver);
	}
}
