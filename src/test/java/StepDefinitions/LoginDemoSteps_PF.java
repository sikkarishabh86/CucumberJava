package StepDefinitions;

import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.Homepage_PF;
import pageFactory.LoginPage_PF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps_PF {
	
	WebDriver driver = null;
	LoginPage_PF login;	
	Homepage_PF logout;
	
	@Given("Browser is open")
	public void browser_is_open() {
		
		System.out.println("Inside page factory class");
//		String ProjectPath = System.getProperty("user.dir");
//		System.out.println("Poject path is :"+ProjectPath);
//		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	    
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
	    
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
	    
	}
	
	@And("User clicks on login")
	public void user_clicks_on_login() {
		
		login.clickLoginButton();
//		driver.findElement(By.id("login")).click();	
	    
	}

	@Then("User is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() throws InterruptedException {
		
//		Thread.sleep(2000);
		logout = new Homepage_PF(driver);		
		logout.checkLogoutIsDisplayed();
//		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
	    
	}

}
