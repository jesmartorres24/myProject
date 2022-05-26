package Academy.E2E;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.LandingPage;
import resources.base;

public class HomePage extends base {

	@Test
	public void HomePageNav() throws IOException{
		
		driver = webdriver();
		driver.get("https://www.qaclickacademy.com/");
		LandingPage landing = new LandingPage(driver);
		landing.homepop().click();
		landing.getLogin().click();
		
	
	}
	
}
