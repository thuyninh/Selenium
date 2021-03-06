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
	myaction.click("xpath=.//*[@id='u_0_m']");
	Assert.assertEquals(myaction.getText("xpath=.//*[@id='loginform']/div[4]/a[1]"), "Quên tài khoản?");
	myaction.close();
	myaction.quit();
	}
	@Test
	public void EmailBlank(){
	System.setProperty("webdriver.chrome.driver","F:\\HOC\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebdriverAction myaction = new WebdriverAction(driver);
	myaction.open("https://www.facebook.com/");
	myaction.sendKey("xpath=.//*[@id='email']","voi.coipro91@gmail.com");
	myaction.click("xpath=.//*[@id='u_0_m']");
	Assert.assertEquals(myaction.getText("xpath=.//*[@id='globalContainer']/div[3]/div/div/div/div[2]"), "Mật khẩu bạn đã nhập không chính xác. Quên mật khẩu?");
	myaction.close();
	myaction.quit();
	}
}
