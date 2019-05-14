package org.totalqa.tests;

import org.testng.Assert;
import org.testng.IHookable;
import org.testng.annotations.Test;
import org.totalqa.pages.LoginPage;
import org.totalqa.util.BaseClass;

public class LoginTests extends BaseClass implements IHookable
{
	@Test(description="Validate Login Functionality",priority=1)
	public static void login() throws InterruptedException 
	{
		LoginPage login = new LoginPage(driver);
		
		String actual =   login.login("Admin", "Admin123"); 
		String expected= "Logged in as Super User () at Inpatient Ward.          ";
		int actualLength = actual.length();
		int expectedLength =expected.length();
		
		System.out.println(actual +"--" + actualLength);
		System.out.println(expected+"--"+expectedLength);
		
		Assert.assertEquals(actual,expected);
	}

}