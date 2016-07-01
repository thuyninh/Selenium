//TC 01: EmailPassBlank: khong nhap gia tri cho 2 trương e mail và pass
//TC 02: PassBlank : Khong nhap gia tri cho truong pass

package org.webdriver.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.webdriver.action.WebdriverAction;

import org.testng.Assert;

public class WebdriverDemo {
	@Test
	public void EmailPassBlank(){
	System.setProperty("webdriver.chrome.driver","F:\\HOC\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebdriverAction myaction = new WebdriverAction(driver);
	myaction.open("https://www.facebook.com/");
	myaction.click(".//*[@id='u_0_m']");
	Assert.assertEquals(myaction.getText(".//*[@id='loginform']/div[4]/a[1]"), "Quên tài khoản?");
	myaction.close();
	myaction.quit();
	}
	@Test
	public void PassBlank(){
	System.setProperty("webdriver.chrome.driver","F:\\HOC\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebdriverAction myaction = new WebdriverAction(driver);
	myaction.open("https://www.facebook.com/");
	myaction.sendKey(".//*[@id='email']","voi.coipro91@gmail.com");
	myaction.click(".//*[@id='u_0_m']");
	Assert.assertEquals(myaction.getText(".//*[@id='globalContainer']/div[3]/div/div/div/div[2]"), "Mật khẩu bạn đã nhập không chính xác. Quên mật khẩu?");
	myaction.close();
	myaction.quit();
	}
}
