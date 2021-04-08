package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vImal\\EclipSelenium-2\\LocatorDay2\\Drivers\\chromedriver.exe");
		
		WebDriver driv= new ChromeDriver();
		driv.get("http://www.swiggy.com");
		
		driv.manage().window().maximize();
		
		WebElement locatn = driv.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[1]/input"));
		locatn.sendKeys("chennai");
	}

}
