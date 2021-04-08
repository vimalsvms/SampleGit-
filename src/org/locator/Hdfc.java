package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vImal\\EclipSelenium-2\\LocatorDay2\\Drivers\\chromedriver.exe");
		
			WebDriver driv=new ChromeDriver();
			driv.get("https://netbanking.hdfcbank.com/");
			
			driv.manage().window().maximize();
			
			WebElement custid = driv.findElement(By.className("input_password"));
			custid.sendKeys("54321");
	}

}
