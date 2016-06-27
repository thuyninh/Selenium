import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	// tao phuong thuc
	@Test
	public void EmailBlank() {
		// open Browser
		System.setProperty("webdriver.chrome.driver", "F:\\HOC\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		// click Next
		driver.findElement(By.cssSelector("#next")).click();
		// verify
		String error = driver.findElement(By.id("errormsg_0_Email")).getText();
		Assert.assertEquals(error, "Please enter your email.");
		driver.close();
	}

	@Test
	public void PassBlank() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\HOC\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		// nhap email
		driver.findElement(By.cssSelector("#Email")).sendKeys("thuyninh199@gmail.com");
		// click Next
		driver.findElement(By.cssSelector("#next")).click();
		// click Login
		driver.findElement(By.id("signIn")).click();

		// v
		String error = driver.findElement(By.id("#errormsg_0_Passwd")).getText();
		Assert.assertEquals(error, "Please enter your password.");
		driver.close();
	}

}
