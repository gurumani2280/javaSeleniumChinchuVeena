package com.pack1a;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M1a {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);
		
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("just1Enter");
		Thread.sleep(3000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alert text "+ alertText);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.quit();
	}

}
