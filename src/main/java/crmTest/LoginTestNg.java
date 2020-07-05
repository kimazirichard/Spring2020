package crmTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestNg {

	WebDriver driver;

	@BeforeTest
	public void init() throws InterruptedException {

		// setting up the property
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		// creating web driver instance
		driver = new ChromeDriver();

		// maximizing browser
		driver.manage().window().maximize();

		// get to the site
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");

	}
@Test
	public void login1() throws InterruptedException {

		// Element library
		By USERNAME_FIELD_LOCATOR = By.id("username");
		By PASSWORD_FIELD_LOCATOR = By.id("password");
		By SIGNIN_FIELD_LOCATOR = By.name("login");

		// Data
		String loginId = "demo@techfios.com";
		String password = "abc123";

		driver.findElement(USERNAME_FIELD_LOCATOR).sendKeys(loginId);
		driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys(password);
		driver.findElement(SIGNIN_FIELD_LOCATOR).click();

	}
}
