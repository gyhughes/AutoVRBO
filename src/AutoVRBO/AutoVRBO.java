package AutoVRBO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// Youtube tutorial: https://www.youtube.com/watch?v=-eJ2cZXyJ0E
// Download Jars and web drivers: http://www.seleniumhq.org/download/
public class AutoVRBO {

	public static void main(String[] args) throws InterruptedException {
		String email, pw;
		// Assign email and password.
		if (args.length == 2) {
			email = args[0];
			pw = args[1];
		} else {
			System.err.println("Usage: AutoVRBO email password");
			return;
		}
		
		// Use gecko as Firefox webdriver.
		System.setProperty("webdriver.gecko.driver", "WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.vrbo.com/haod");
		Thread.sleep(5000);

		// Login.
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(email);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pw);
		WebElement submit = driver.findElement(By.id("form-submit"));
		submit.click();
		Thread.sleep(10000); // Can be shortened depending on network connection.
		
		// Refresh calendar.
		WebElement update = driver.findElement(By.id("republishCalendarButton"));
		update.click();

		// Close app.
		driver.close();
		driver.quit();
	}
}
