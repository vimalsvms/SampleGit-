package org.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	
	private void iphones() {
		System.out.println("iphone 12 pro max");
	}
	
	private void samsung() {
		System.out.println("samsung s12 ");
	}
	
	private void oneplus() {
		System.out.println("oneplus 9");
	}
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vImal\\EclipSelenium-2\\LocatorDay2\\Drivers\\chromedriver.exe");
		
		WebDriver driv=new ChromeDriver();
		
		driv.get("http://demo.automationtesting.in/Register.html");
		
		driv.manage().window().maximize();
		
	}

}
