package com.w2a.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.Page;
import com.w2a.utilities.Utilities;

public class CustomListeners extends Page implements ITestListener {

	public void onTestStart(ITestResult result) {

		test = rep.startTest(result.getName().toUpperCase());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(LogStatus.PASS, result.getName().toUpperCase() + " PASS");
		test.log(LogStatus.PASS, test.addScreenCapture(Utilities.screenshotName));

		Reporter.log("Capturing ScreenShot");
		Reporter.log("<a target=\"_blank\" href=" + Utilities.screenshotName + ">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=" + Utilities.screenshotName + "><img scr=" + Utilities.screenshotName
				+ " height=200 width=200></img></a>");

		rep.endTest(test);
		rep.flush();
	}

	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");

		try {
			Utilities.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Extends Reports
		test.log(LogStatus.FAIL, result.getName().toUpperCase() + "Failed with exception: " + result.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(Utilities.screenshotName));

		// ReportNG Reports
		Reporter.log("Capturing ScreenShot");
		Reporter.log("<a target=\"_blank\" href=" + Utilities.screenshotName + ">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=" + Utilities.screenshotName + "><img scr=" + Utilities.screenshotName
				+ " height=200 width=200></img></a>");

		rep.endTest(test);
		rep.flush();
	}

	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, result.getName().toUpperCase() + "Skipped the Test as the Run mode is NO");
		rep.endTest(test);
		rep.flush();

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
