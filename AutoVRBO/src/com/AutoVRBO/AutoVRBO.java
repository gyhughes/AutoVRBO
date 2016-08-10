package com.AutoVRBO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Youtube tutorial: https://www.youtube.com/watch?v=-eJ2cZXyJ0E
// Download Jars and web drivers: http://www.seleniumhq.org/download/
public class AutoVRBO {

	public static void main(String[] args) throws InterruptedException {
		// Use gecko as Firefox webdriver.
		System.setProperty("webdriver.gecko.driver", "Web Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.vrbo.com");
		driver.get("https://www.codes.resortlock.com/Account.aspx/Login");
		Thread.sleep(2000); // Gives webpage chance to load.
		
		
		
		
		//driver.close();
	}
}
