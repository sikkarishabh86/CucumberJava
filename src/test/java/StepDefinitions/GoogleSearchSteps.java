package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;


//	@Given("Browser is open")
//	public void browser_is_open() {
//
//		String ProjectPath = System.getProperty("user.dir");
//		System.out.println("Poject path is :"+ProjectPath);
//		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/Drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		//driver.manage().window().maximize();
//	}
//
//	@And("User is on search page")
//	public void user_is_on_search_page() {
//		driver.navigate().to("https://www.google.com/");
//
//	}
//
//	@When("User enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//
//		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
//
//	}
//
//	@And("Hits enter")
//	public void hits_enter() {
//
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//	}
//
//	@Then("User is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		driver.getPageSource().contains("Online Courses");
//		driver.close();
//	}
//
//
}
