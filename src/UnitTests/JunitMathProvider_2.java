package UnitTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Application.MathProvider;

public class JunitMathProvider_2 {
	MathProvider provider;

	public JunitMathProvider_2() {
		// TODO Auto-generated constructor stub
		provider = new MathProvider();
	}

	@Test
	public void multiply() {
		System.out.println("Starting test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object() {
		}.getClass().getEnclosingMethod().getName());
	}
}
