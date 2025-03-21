package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	//declaration

		@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']") 

		private WebElement smartPhoneCartProductButton;
		@FindBy(xpath = "//h1[text() = 'Shopping cart']/../..//img[@title='Show details for Smartphone']/../..//input[@name='removefromcart']")
		private WebElement smartPhoneCheckBox;
		@FindBy(name = "updatecart") private WebElement updatecartButton;
		@FindBy(name = "continueshopping") private WebElement continueshoppingButton;
		@FindBy(id="termsofservice") private WebElement termsofservicecheckbox;
		@FindBy(id = "checkout") private WebElement checkoutButton;

		

		//initialization

		public ShoppingCartPage(WebDriver driver)
		{
            PageFactory.initElements(driver,this);
		}

		//utilization

		public WebElement getSmartPhoneCartProductButton() {
			return smartPhoneCartProductButton;
		}
		public WebElement getSmartPhoneCheckBox() {
			return smartPhoneCheckBox;
		}
		public WebElement getUpdatecartButton() {
			return updatecartButton;
		}
		public WebElement getContinueshoppingButton() {
			return continueshoppingButton;
		}
		public WebElement getCheckoutButton() {
			return checkoutButton;
		}
		public WebElement getTermsOfServicesCheckbox() {
			// TODO Auto-generated method stub
			return null;
		}








	}




