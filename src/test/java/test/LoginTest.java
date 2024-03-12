package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver; 
	
	String username = "demo@codefios.com";
	String Password = "abc123"; 
	String dashboardValText ="Dashboard";
	
	@Test
	public void UserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init(); 
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(username);
		loginpage.insertPassword(Password);
		loginpage.clickSignIn(); 
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage(dashboardValText);
		
		BrowserFactory.tearDown();
		
		
	}
}
