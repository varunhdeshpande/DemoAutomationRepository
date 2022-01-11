package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserDemo {
	private static WebDriver OBroswer=null;
	public static void main (String[]args)

	{
		LaunchBrowser();
		navigate();
		//Login();
		//minimizeFlyoutWindow();
		//CreateUser();
		//deleteUser();
		//Close();


	}

	private static void LaunchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chromedriver",path+"\\Library\\Drivers\\chromedriver.exe");
			OBroswer= new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			OBroswer.get("http://localhost:81/login.do");
			Thread.sleep(2000);
			OBroswer.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}


