package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import page.NewCustomerPage;
import util.BrowserFactory;

public class NewCustomerTest {

	WebDriver driver; 
	
	String newCustomerText = "New Customer";
	String userName = "demo@codefios.com";
	String Password = "abc123";
	String dashboardValText = "Dashboard";
	String fullName = "Test User" ; 
	String Company = "Techfios";
	
	@Test
	public void userShouldBeableToAddCustomer() {
		
		driver = BrowserFactory.init(); 
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.login(userName, Password); 
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage(dashboardValText); 
		dashboardpage.clickOnCustomer();
		dashboardpage.clickOnAddCustomer();
		
		
		NewCustomerPage newCustomerPage = PageFactory.initElements(driver, NewCustomerPage.class);
		newCustomerPage.validateNewCustomerPage(newCustomerText);
		newCustomerPage.insertFullName(fullName);
		newCustomerPage.selectCompany(Company);
		newCustomerPage.clickSave();
		
		BrowserFactory.tearDown();
	}
	
	
	
	
}
