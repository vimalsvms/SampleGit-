package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vImal\\EclipSelenium-2\\LocatorDay2\\Drivers\\chromedriver.exe");
		
		WebDriver driv=new ChromeDriver();
		
		driv.get("http://www.redbus.com");
		
		driv.manage().window().maximize();
		
		WebElement frm = driv.findElement(By.id("src"));
		frm.sendKeys("chennai");
		
		WebElement to = driv.findElement(By.id("dest"));
		to.sendKeys("Banglore");
	}

}
