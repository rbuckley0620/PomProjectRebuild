package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Dashboard')]")
	WebElement DASHBOARD_VALIDATION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add Customer')]")
	WebElement ADD_CUSTOMER_MENU_ELEMENT;

	public void validateDashboardPage(String dashboardValText) {
		Assert.assertEquals(DASHBOARD_VALIDATION_ELEMENT.getText(), dashboardValText, "Dashboard page NOT available!");
	}

	public void clickOnCustomer() {
		CUSTOMER_MENU_ELEMENT.click();
	}

	public void clickOnAddCustomer() {
		ADD_CUSTOMER_MENU_ELEMENT.click();
	}

}
