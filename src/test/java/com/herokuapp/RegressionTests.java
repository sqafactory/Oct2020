package com.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegressionTests {
	
	@Test
	public void startup() {
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		String url = "https://the-internet.herokuapp.com/login";
		chrome.get(url);
				
		
	}
	
	

}
