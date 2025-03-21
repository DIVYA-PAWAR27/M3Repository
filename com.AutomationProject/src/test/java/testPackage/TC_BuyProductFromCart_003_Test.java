package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import pomPackage.CheckOutPage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(genericLibrary.MyListeners.class)
public class TC_BuyProductFromCart_003_Test extends BaseTest {
  @Test
  public void buyProductMethod() throws EncryptedDocumentException, IOException {
	  WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLinks().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();

		ep.getSmartPhoneAddToCartButton().click();
		wp.getShoppingCartLink().click();

		

		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getSmartPhoneCheckBox().click();
		
		sp.getTermsOfServicesCheckbox().click();
		sp.getCheckoutButton().click();
		
		CheckOutPage cp = new CheckOutPage(driver);
		
		cp.buyProduct();
		
  }
  
}
