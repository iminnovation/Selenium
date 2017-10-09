package com.qa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTests {
	String driverPath = "<path to gecko driver executable>";
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		driver = new FirefoxDriver();
  }
}
