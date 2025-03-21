package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners extends BaseTest implements ITestListener {

	@Override

	public void onTestStart(ITestResult result) {

		Reporter.log("--Test Start--" + result.getName(), true);

	}

	@Override

	public void onTestSuccess(ITestResult result) {

		Reporter.log("--Test Successful--" + result.getName(), true);

	}

	@Override

	public void onTestFailure(ITestResult result) {

		String faliedMethod = result.getName();

		String ldt = LocalDateTime.now().toString();

		String time = ldt.replaceAll(":", "-");

		TakesScreenshot ts = (TakesScreenshot)driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File des = new File("./errorshots/" + faliedMethod + time + ".png");

		try {
			org.openqa.selenium.io.FileHandler.copy(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	@Override

	public void onTestSkipped(ITestResult result) {

		Reporter.log("--Test skipped--" + result.getName(), true);

	}

	@Override

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		Reporter.log("--Test Failed  Within Success Percentage--" + result.getName(), true);

	}

	@Override

	public void onTestFailedWithTimeout(ITestResult result) {

		Reporter.log("--Test failed with timeouts--" + result.getName(), true);

	}

	@Override

	public void onStart(ITestContext context) {

		Reporter.log("--Test on start--" + context.getName(), true);

	}

	@Override

	public void onFinish(ITestContext context) {

		Reporter.log("--Test on finish--" + context.getName(), true);

	}

}
