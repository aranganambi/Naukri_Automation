package limiting_Driver;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import baseClass.Base_Class;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Home_Page;
import pom.Login_page;

public class Nauckri2 extends Base_Class {
	public static WebElement jobList;

	public static void browser_Launch() {
		try {
			browser_Launch_Chrome();
			maximize();
			properties();
			get_Url(url);
			waitimp(10);
			System.out.println("Browser Launched Successfully");
		} catch (Exception e) {
			System.out.println("Browser Launched Fail");
		}
	}

	public static void naukri_Login() {
		Login_page login = new Login_page(driver);
		try {
			input_Value(login.getUsername(), userName);
			input_Value(login.getPassword(), password);
			clicks(login.getLoginbutton());
			System.out.println("User Logedin Successfully");
		} catch (Exception e) {
			System.out.println("Login Failed");
		}
	}

	public static void search_Job() throws InterruptedException {
		Thread.sleep(2000);
		Home_Page home = new Home_Page(driver);
		try {
			clicks(home.getSearch_Job_Here());
			input_Value(home.getSkillset(), skillset);
			clicks(home.getExperience_Dropdown());
			clicks(home.getYears_Of_Experience());
			input_Value(home.getLocations(), locations);
			clicks(home.getSearch_Button());
			
			//WFH
			clicks(home.getWFH_Checkbox());
			Thread.sleep(3000);
			//Hybrid
			clicks(home.getHybrid_Checkbox());
			Thread.sleep(3000);
			//Remote
			clicks(home.getRemote_Checkbox());
		} catch (Exception e) {
			System.out.println("User not able to job search");
		}

	}

	public static void limiting_Driver() throws InterruptedException {
		Thread.sleep(1000);
		Home_Page home = new Home_Page(driver);
		jobList=home.getJob_List();
	}

	public static void clicking_Links() throws Throwable {
		Home_Page home = new Home_Page(driver);
		List<WebElement> companyLinks=jobList.findElements(By.xpath("//main/div/div[2]/div[2]/div/div/div/div[1]/a"));
		
		for (int i = 0; i < companyLinks.size(); i++) {
			Thread.sleep(1000);
			String keys = Keys.chord(Keys.CONTROL, Keys.ENTER);
			companyLinks.get(i).sendKeys(keys);
			Thread.sleep(1000);
		}
	}

	public static void windowHandles() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		driver.switchTo().window(parent);
	}

	public static void clickNext() throws Throwable {
		Home_Page home = new Home_Page(driver);
		clicks(home.getNext_Button());
		
	}

	public static void page_Title() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
