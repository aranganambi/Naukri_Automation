package testCases;

import org.testng.annotations.Test;

import limiting_Driver.Nauckri2;

public class Naukri_TestCases extends Nauckri2 {
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
