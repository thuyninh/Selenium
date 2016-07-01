package org.webdriver.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebdriverAction {
	WebDriver driver =null;
	// khoi tao webdriver
public WebdriverAction(WebDriver driver){
	this.driver = driver;
}
public void open(String url){
	driver.get(url);
}
public void click(String locator){
	driver.findElement(By.xpath(locator)).click();
}
public void sendKey(String locator,String value ){
	driver.findElement(By.xpath(locator)).sendKeys(value);
}
public String getText(String locator){
	 return driver.findElement(By.xpath(locator)).getText();
}
public void close(){
	driver.close();
}
public void quit(){
	driver.quit();
}
}
