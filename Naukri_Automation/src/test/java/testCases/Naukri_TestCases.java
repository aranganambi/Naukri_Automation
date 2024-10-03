package testCases;

import org.testng.annotations.Test;

import limiting_Driver.Nauckri_Automation;
import limiting_Driver.Nauckri_Automation;

public class Naukri_TestCases extends Nauckri_Automation {
	@Test
	public static void naukriTest() throws Throwable {
		browser_Launch();
		naukri_Login();
		search_Job();
		limiting_Driver();
		clicking_Links();
		
		for (int i = 1; i <= 1; i++) {
			windowHandles();
			clickNext();
			limiting_Driver();
			clicking_Links();
		}
		page_Title();
	}
}
