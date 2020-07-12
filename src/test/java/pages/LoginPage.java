package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected WebDriver driver;

	private By txt_username_login = By.id("name");
	
	private By txt_password_login = By.id("password");
	
	private By btn_login = By.id("login");
	
	private By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		if(!driver.getTitle().equalsIgnoreCase("TestProject Demo")) {
			throw new IllegalStateException("This is not login page. The current page is "+driver.getCurrentUrl());
		}
	}
	
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username_login).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password_login).sendKeys(password);
		
	}
	
	public void clickLoginButton() {
		
		driver.findElement(btn_login).click();
		
	}
	
	public void checkLogoutIsDispalyed() {
		
		driver.findElement(btn_logout).isDisplayed();
		
	}
}
