package com.sgtesting.tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzon {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();

	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void navigate()
	{
		try
		{
			driver.navigate().to("https://www.amazon.in");
			Thread.sleep(2000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12mini");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
			Thread.sleep(2000);
			driver.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
