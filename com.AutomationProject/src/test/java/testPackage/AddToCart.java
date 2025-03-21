package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;
@Listeners(genericLibrary.MyListeners.class)
public class AddToCart extends BaseTest {

	@Test

	public void addToCartMethod() throws IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLinks().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		ep.getSmartPhoneAddToCartButton().click();

		wp.getShoppingCartLink().click();
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(sp.getSmartPhoneCartProductButton().isDisplayed(), true, "Product is not added");
		sa.assertAll();

		//if( sp.getSmartPhoneCartProductButton().isDisplayed())

		//{

		//	System.out.println("product is added");

		//}

		//else

		//{

		//	System.err.println("Testcase fail");

		//}

	}



}



