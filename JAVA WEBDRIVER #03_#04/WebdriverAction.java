// su dung cac selector khac nhau
//xay dung lop loi framework -2
package org.webdriver.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebdriverAction {
	WebDriver driver = null;

	// khoi tao webdriver
	public WebdriverAction(WebDriver driver) {
		this.driver = driver;
	}

	private By getElement(String locator) {
		By by = null;
		if (locator.startsWith("id=")) {
			locator = locator.substring(3);
			by = By.id(locator);
		} else if (locator.startsWith("xpath=")) {
			locator = locator.substring(6);
			by = By.xpath(locator);
		} else if (locator.startsWith("link=")) {
			locator = locator.substring(5);
			by =By.linkText(locator);
		} else if (locator.startsWith("css=")) {
			locator = locator.substring(4);
			by =By.cssSelector(locator);
		}else if(locator.startsWith("name=")){
			locator = locator.substring(5);
			by =By.name(locator);
		}else{
			System.out.println("error");
		}
		return by;
	}

	public void open(String url) {
		driver.get(url);
	}

	public void click(String locator) {
		driver.findElement(getElement(locator)).click();
	}

	public void sendKey(String locator, String value) {
		driver.findElement(getElement(locator)).sendKeys(value);
	}

	public String getText(String locator) {
		return driver.findElement(getElement(locator)).getText();
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}
}
