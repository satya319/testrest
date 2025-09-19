package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class smoke {
	
@Test(description = "browser launch test")
@Description("this test will launch the browser")
@Severity(SeverityLevel.CRITICAL)
public void browserlaunch() {
	String broswer = System.getProperty("browser");
	String url = "https://automationexercise.com/";
	WebDriver driver= null;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
//	if(broswer.equals("Chrome")) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//	}
	driver.get(url);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
}
}
