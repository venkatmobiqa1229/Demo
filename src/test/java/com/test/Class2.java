package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class2 {

	/**
	 * @param args
	 */
	@Test
	public void testGoogle()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.quit();
	}
	

}
