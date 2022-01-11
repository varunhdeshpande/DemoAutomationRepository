package com.sgtesting.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginlogoutfirefoxDemo {
	private static WebDriver OBroswer=null;
	public static void main (String[]args)

	{
		LaunchBrowser();
		navigate();
		Login();
		minimizeFlyoutWindow();
		logout();
		closeApplcation();
	}

	private static void LaunchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe");
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
			OBroswer.navigate().to("http://localhost:81/login.do");
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			By obj=By.id("username");
			WebElement oUser=OBroswer.findElement(obj);
			oUser.sendKeys("admin");

			By obj1=By.name("pwd");
			WebElement oPassword=OBroswer.findElement(obj1);
			oPassword.sendKeys("manager");

			OBroswer.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(8000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutWindow()
	{
		try
		{
			OBroswer.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(8000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void logout()
	{
		try
		{
			OBroswer.findElement(By.id("logoutLink")).click();
			Thread.sleep(8000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplcation()
	{
		try
		{
			OBroswer.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}

