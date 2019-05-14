package org.totalqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImpatientWardHome {

	WebDriver driver;

	public ImpatientWardHome(WebDriver driver)
	{
		this.driver = driver;

	}
	
	public String  ValidatePage(String username,String password)
	{

		//Enter username
		driver.findElement(By.id("username")).sendKeys("Admin");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("Admin123");
		//Click inpatientWard
		driver.findElement(By.id("Inpatient Ward")).click();

		driver.findElement(By.id("loginButton")).submit();
	
		String actual = driver.findElement(By.cssSelector("#home-container>h4")).getText();
		return actual;
	}
}
