import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetStoreLogin {
	
	private WebDriver driver;
	private String url = "https://petstore.octoperf.com/actions/Catalog.action";
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("nag_1234");
		WebElement pwdField = driver.findElement(By.name("password"));
		pwdField.clear();
		pwdField.sendKeys("Test@123");
		driver.findElement(By.name("signon")).click();
		String welcomeMsg = driver.findElement(By.id("WelcomeContent")).getText();
		assertTrue(welcomeMsg.contains("Nagaraj"));
	}

}
