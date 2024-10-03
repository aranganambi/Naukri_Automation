package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver driver;
	
	@FindBy(css = "span.nI-gNb-sb__placeholder")
	private WebElement Search_Job_Here;
	
	@FindBy(xpath = "//*[text()='5 years']")
	private WebElement Years_Of_Experience;
	
	@FindBy(xpath = "//*[text()='Work from office']")
	private WebElement WFH_Checkbox;
	
	@FindBy(xpath = "//body/div[1]/div/main/div/div[2]/div[2]/div")
	private WebElement Job_List;
	
	public WebElement getJob_List() {
		return Job_List;
	}

	public WebElement getNext_Button() {
		return Next_Button;
	}

	@FindBy(xpath = "//*[text()='Next']")
	private WebElement Next_Button;
	
	public WebElement getWFH_Checkbox() {
		return WFH_Checkbox;
	}

	public WebElement getHybrid_Checkbox() {
		return Hybrid_Checkbox;
	}

	public WebElement getRemote_Checkbox() {
		return Remote_Checkbox;
	}

	@FindBy(xpath = "//*[text()='Hybrid']")
	private WebElement Hybrid_Checkbox;
	
	@FindBy(xpath = "//*[text()='Remote']")
	private WebElement Remote_Checkbox;

	public WebElement getYears_Of_Experience() {
		return Years_Of_Experience;
	}

	public WebElement getSearch_Job_Here() {
		return Search_Job_Here;
	}

	public WebElement getSkillset() {
		return Skillsets;
	}

	public WebElement getExperience_Dropdown() {
		return Experience_Dropdown;
	}


	public WebElement getLocations() {
		return Location;
	}

	public WebElement getSearch_Button() {
		return Search_Button;
	}

	@FindBy(xpath = "(//input[@class='suggestor-input '])[1]")
	private WebElement Skillsets;
	
	@FindBy(id = "experienceDD")
	private WebElement Experience_Dropdown;
	
	@FindBy(xpath = "(//input[@class='suggestor-input '])[2]")
	private WebElement Location;
	
	@FindBy(xpath = "//*[text()='Search']")
	private WebElement Search_Button;

	public Home_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
}
