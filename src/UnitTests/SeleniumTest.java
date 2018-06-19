package UnitTests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.junit.*;

public class SeleniumTest {
	
	private static WebDriver driver = null;
	
	WebElement element = null;
	
	@BeforeClass
	public static void settp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\v-victw\\Desktop\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		String url="http://www.store.demoqa.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	@Test
	public void Valid_UserCredential() {
		System.out.println("Starting test " + new Object() {}.getClass().getEnclosingMethod().getName());
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("TestingLA4v@outlook.com");
		driver.findElement(By.id("pwd")).sendKeys("9Esu%YxUmZuP1lBA");
		driver.findElement(By.id("login")).click();
		try {
			element = driver.findElement(By.xpath(".//*[@id='account_logout']/a"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.assertNotNull(element);
			System.out.println("Ending test " + new Object() {}.getClass().getEnclosingMethod().getName());
		}
	}
	@Test 
	public void inValid_UserCredential() {
		System.out.println("Starting test " + new Object() {}.getClass().getEnclosingMethod().getName());
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("123456@outlook.com");
		driver.findElement(By.id("pwd")).sendKeys("9Esu%YxUmZuP1lBA");
		driver.findElement(By.id("login")).click();
		try {
			element = driver.findElement(By.xpath(".//*[@id='account_logout']/a"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.assertNotNull(element);
			System.out.println("Ending test " + new Object() {}.getClass().getEnclosingMethod().getName());
		}
	}
	@AfterClass
	public static void tearDonw() {
		driver.close();
	}
}
