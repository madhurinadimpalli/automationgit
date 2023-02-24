package automation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {

public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("FAILED Test");
		failed(result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}
	public void onFinish(ITestContext context) {
		
	}
    

	

	
	}