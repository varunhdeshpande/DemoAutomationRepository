package com.sgtesting.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchdemo {
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
		  System.setProperty("webdriver.chromedriver", "E:\\ExampleAutomations\\Automation\\ExampleJavaPrograms\\src\\com\\sgtesting\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
		  OBroswer= new ChromeDriver();
		  OBroswer.manage().window().maximize();
		  Thread.sleep(4000);  
	
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
		  //OBroswer.navigate().to("http://localhost:81/login.do");
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
