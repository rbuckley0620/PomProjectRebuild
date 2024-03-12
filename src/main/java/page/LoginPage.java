package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement SIGN_IN_BUTTON_ELEMENT;

	public void insertUserName(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
	}

	public void insertPassword(String Password) {
		PASSWORD_ELEMENT.sendKeys(Password);

	}

	public void clickSignIn() {
		SIGN_IN_BUTTON_ELEMENT.click();
	}

	public void login(String username, String Password) {
		USER_NAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(Password);
		SIGN_IN_BUTTON_ELEMENT.click();
	}

}
