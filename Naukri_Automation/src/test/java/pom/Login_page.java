package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='usernameField']")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	@FindBy(id="passwordField")
	private WebElement password;
	
	@FindBy (xpath ="(//*[text()='Login'])[3]")
	private WebElement loginbutton;
	
	public Login_page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}
}
