package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="Email") private WebElement emailTB;
	@FindBy(id="Password") private WebElement passwordTB;
	@FindBy(xpath="//input[@value='Log in']") private WebElement loginButton;
	@FindBy(id="RememberMe") private WebElement rememberMeCheckbox;
	@FindBy(linkText="Forgot password?") private WebElement forgotPasswordLink;
	
	//initiallization
	public LoginPage(WebDriver driver ) {
		
		PageFactory.initElements(driver, this);
}
	
	//Utillization

	public WebElement getEmailTB() {
		return emailTB;
	}

	public void setEmailTB(WebElement emailTB) {
		this.emailTB = emailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public void setPasswordTB(WebElement passwordTB) {
		this.passwordTB = passwordTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getRememberMeCheckbox() {
		return rememberMeCheckbox;
	}

	public void setRememberMeCheckbox(WebElement rememberMeCheckbox) {
		this.rememberMeCheckbox = rememberMeCheckbox;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public void setForgotPasswordLink(WebElement forgotPasswordLink) {
		this.forgotPasswordLink = forgotPasswordLink;
	}
	public void invalidLoginMethod(String email, String pass) throws InterruptedException

	{

		emailTB.sendKeys(email);

		passwordTB.sendKeys(pass);

		loginButton.click();

		Thread.sleep(1000);

		emailTB.clear();

		passwordTB.clear();

		

	}

	

	public void validLoginMethod(String email, String pass)

	{

		emailTB.sendKeys(email);

		passwordTB.sendKeys(pass);

		loginButton.click();

	}


		
	}
	

	
