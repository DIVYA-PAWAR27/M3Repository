package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	@FindBy(linkText="Register") private WebElement registerLink;
	@FindBy(linkText="Log in") private WebElement loginLink;
	@FindBy(xpath="//span[text()='Shopping cart']") private WebElement shoppingCartLink;
	@FindBy(xpath="//span[text()='Wishlist']") private WebElement wishlistLink;
	@FindBy(partialLinkText="BOOKS") private WebElement bookLink;
	@FindBy(partialLinkText="COMPUTERS") private WebElement computersLink;
	@FindBy(partialLinkText="ELECTRONICS") private WebElement electronicsLinks;
	@FindBy(linkText="Log out") private WebElement logOutLink;
	
	public WebElement getLogOutLink() {
		return logOutLink;
	}

	public void setLogOutLink(WebElement logOutLink) {
		this.logOutLink = logOutLink;
	}

	//initiallization
	public WelcomePage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
      //Utillization
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getBookLink() {
		return bookLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLinks() {
		return electronicsLinks;
	}
	public void logOut()
	{
		logOutLink.click();
	}
	
	
	

}
