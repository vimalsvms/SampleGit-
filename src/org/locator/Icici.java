package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vImal\\EclipSelenium-2\\LocatorDay2\\Drivers\\chromedriver.exe" );
		
		WebDriver driv=new ChromeDriver();
		
		driv.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		driv.manage().window().maximize();
		
		WebElement Usrname = driv.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		Usrname.sendKeys("12345");
		
		WebElement pass = driv.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pass.sendKeys("98765");
	}

}
