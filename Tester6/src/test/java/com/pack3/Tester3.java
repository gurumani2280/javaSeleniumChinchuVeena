package com.pack3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tester3 extends SuperTest{
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("http://www.2shared.com/");
		driver.findElement(By.id("upField")).sendKeys("someFilePath");
		Thread.sleep(5000);
	}

}
