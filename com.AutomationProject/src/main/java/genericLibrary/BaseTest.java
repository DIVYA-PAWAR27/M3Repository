package genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPackage.LoginPage;
import pomPackage.WelcomePage;

public class BaseTest implements IAutoConstant {

	protected static WebDriver driver;

	@BeforeClass

	public void browserSetUp() throws IOException {

		Flib flib = new Flib();

		String browser = flib.readPropertyData(PROP_PATH_MAIN, "chrome");

		String url = flib.readPropertyData(PROP_PATH_MAIN,URL);

		

		if(browser.equalsIgnoreCase("chrome")) {

			driver=new ChromeDriver();

		}

		

		else if(browser.equalsIgnoreCase("edge")) {

			driver=new EdgeDriver();

		}

		

		else if(browser.equalsIgnoreCase("firefox")) {

			driver=new FirefoxDriver();

		}

		

		else

		{

			System.out.println("Enter the valid url");

		}

		

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(url);

	}

	@BeforeMethod

	public void validLogin() throws EncryptedDocumentException, IOException

	{

		WelcomePage wp = new WelcomePage(driver);

		wp.getLoginLink().click();

		

		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();

		String email = flib.readExcelData(EXCEL_PATH_MAIN, VALIDLOGINDATA, 1, 0);

		String pass = flib.readExcelData(EXCEL_PATH_MAIN, VALIDLOGINDATA, 1, 1);

		lp.validLoginMethod(email, pass);

		

	}

	@AfterMethod

	public void logOut()

	{

		WelcomePage wp = new WelcomePage(driver);

		wp.logOut();

	}

	

	

	@AfterClass

	public void browserTearDown() 

	{

		driver.quit();

	}



}


