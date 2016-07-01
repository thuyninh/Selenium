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
public void click(String location){
	driver.findElement(By.xpath(location)).click();
}
public void sendKey(String location,String value ){
	driver.findElement(By.xpath(location)).sendKeys(value);
}
public String getText(String location){
	 return driver.findElement(By.xpath(location)).getText();
}
public void close(){
	driver.close();
}
public void quit(){
	driver.quit();
}
}
