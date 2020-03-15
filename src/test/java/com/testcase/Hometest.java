package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Hometest {
	WebDriver driver;
	@BeforeSuite
	
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 driver = new ChromeDriver();
		driver.get("file:///D:/JBK/Offline%20Website/index.html");
		driver.manage().window().maximize();
				
	}
	

}
