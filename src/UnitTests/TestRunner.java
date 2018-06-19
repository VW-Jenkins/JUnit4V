package UnitTests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(JunitMathProvider_1.class,JunitMathProvider_2.class);
		System.out.println("Total number of test " + result.getRunCount());
		System.out.println("Total number of test failed " + result.getFailureCount());
		
		for(Failure failure: result.getFailures()) {
			System.out.println(failure.getMessage());
		}
		System.out.println(result.wasSuccessful());
	}

}
