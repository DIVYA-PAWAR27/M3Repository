package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseTest;
import genericLibrary.Flib;
import genericLibrary.SelectUtility;

public class CheckOutPage extends BaseTest {
	
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement countryDD;
	@FindBy(id = "BillingNewAddress_City") private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1") private WebElement address1TB;
	@FindBy(id = "BillingNewAddress.Address2") private WebElement address2TB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement zipPostalCodeTB;
	@FindBy(id = "BillingNewAddress_PhoneNumber") private WebElement phoneNoTB;
	@FindBy(xpath="//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton;
	@FindBy(xpath="//input[@onclick='Shipping.save()']") private WebElement shippingAddressContinueButton;
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']") private WebElement shippingMethodContinueButton;
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']") private WebElement paymentMethodContinueButton;
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']") private WebElement paymentInformationContinueButton;
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderButton;
	@FindBy(xpath="//strong[text()='Your order has been successfully processed!']") private WebElement orderProcessdText;
	@FindBy(id="billing-address-select") private WebElement billingAddressOldAddressDD;
	
	
	
	//Initilization
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getCountryDD() {
		return countryDD;
	}
	public WebElement getCityTB() {
		return cityTB;
	}
	public WebElement getAddress1TB() {
		return address1TB;
	}
	public WebElement getAddress2TB() {
		return address2TB;
	}
	public WebElement getZipPostalCodeTB() {
		return zipPostalCodeTB;
	}
	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}
	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}
	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}
	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}
	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}
	public WebElement getPaymentInformationContinueButton() {
		return paymentInformationContinueButton;
	}
	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}
	public WebElement getOrderProcessdText() {
		return orderProcessdText;
	}
	public WebElement getBillingAddressOldAddressDD() {
		return billingAddressOldAddressDD;
	}
	//operational Method
	
	public void buyProduct() throws EncryptedDocumentException, IOException 
	{
		SelectUtility su = new SelectUtility();
		try
		{
		if(billingAddressOldAddressDD.isDisplayed()==true)
		{
			su.selectByVisibleMethod(countryDD, "India");
		}
	}
		catch(Exception e)
		{
			su.selectByVisibleMethod(countryDD, "India");
		}
		su.selectByVisibleMethod(countryDD, "India");
		
		Flib flib = new Flib();
		int rn = flib.randomNumber();
		String city = flib.readExcelData(PROP_PATH_MAIN, "buyproductdetails", 1, 0);
		String address1 = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 1);


		long pin = flib.readExcelData1(EXCEL_PATH_MAIN, "buyproductdetails", 1, 2);
		long phone = flib.readExcelData1(EXCEL_PATH_MAIN, "buyproductdetails", 1, 3);
		String phonenumber = phone + "" + rn;
		 
		cityTB.sendKeys(city);
		address1TB.sendKeys(address1);
		zipPostalCodeTB.sendKeys(String.valueOf(pin));
		phoneNoTB.sendKeys(String.valueOf(phonenumber));
		billingAddressContinueButton.click();
		
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInformationContinueButton.click();
		
	}
		
}
