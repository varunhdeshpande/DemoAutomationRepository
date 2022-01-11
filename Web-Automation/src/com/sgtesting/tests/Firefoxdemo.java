package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefoxdemo {
	private static WebDriver OBroswer=null;
	public static void main (String[]args)
	{
		LaunchBrowser();
		navigate();
		Close();
	}

	
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "E:\\ExampleAutomations\\Automation\\ExampleJavaPrograms\\src\\com\\sgtesting\\Web-Automation\\Library\\Drivers\\geckodriver.exe");
			OBroswer= new FirefoxDriver();
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
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try
		{
			OBroswer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

