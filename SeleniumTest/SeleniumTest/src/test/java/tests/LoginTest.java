package tests;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LandingPage;
import pages.LoginPage;
import pages.WelcomePage;

public class LoginTest {

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
	public void testLogin() {
		LandingPage lndpage = new LandingPage(driver);
		LoginPage lgnpage = lndpage.clickSignIn();
		lgnpage.setUsername("nag_1234");
		lgnpage.setPassword("Test@123");
		WelcomePage wcpage = lgnpage.clickSingIn();
		String actual = wcpage.getWelcomeMsg();
		assertTrue(actual.contains("Nagaraj"));
	}

}
