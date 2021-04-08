package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Locator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vImal\\EclipSelenium-2\\LocatorDay2\\Drivers\\chromedriver.exe");
		
		WebDriver driv=new ChromeDriver();
		driv.manage().window().maximize();
		driv.get("http://www.facebook.com");
		
		WebElement txtemail = driv.findElement(By.id("email"));
		txtemail.sendKeys("welcome");
		
		WebElement txtpass = driv.findElement(By.id("pass"));
		txtpass.sendKeys("testing123");
		
		WebElement btnlogin = driv.findElement(By.name("login"));
		btnlogin.click();
		
	
		
		
	}

}
