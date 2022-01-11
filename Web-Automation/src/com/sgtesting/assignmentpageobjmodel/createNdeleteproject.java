package com.sgtesting.assignmentpageobjmodel;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class createNdeleteproject {
		public static WebDriver oBrowser=null;
		public static ActiTimeDemo1 oPage=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			createCustomer();
			createProject();
			deleteProject();
			deleteCustomer();
			logout();
			closeApplication();
		}
		private static void launchBrowser()
		{
			try
			{
				String path=System.getProperty("user.dir");
				Thread.sleep(4000);
				System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oPage=new ActiTimeDemo1(oBrowser);
				oBrowser.manage().window().maximize();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void navigate()
		{
			try
			{
				oBrowser.navigate().to("http://localhost:81/login.do");
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void login()
		{
			try
			{
				oPage.getUserName().sendKeys("admin");
				Thread.sleep(4000);
				oPage.getPassword().sendKeys("manager");
				Thread.sleep(4000);
				oPage.getLoginButton().click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void minimizeFlyOutWindow()
		{
			try
			{
				oPage.getFlyOutWindow().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void logout()
		{
			try
			{
				oPage.getLogoutLink().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void createCustomer() {
			try {
				oPage.getClickOnTask().click();
				Thread.sleep(3000);
				oPage.getAddNewDropdownInTask().click();
				Thread.sleep(3000);
				oPage.getNewCustomerOption().click();
				Thread.sleep(3000);
				oPage.getCustomerNameField().sendKeys("Oracle");
				Thread.sleep(3000);
				oPage.getCustomerDescriptionField().sendKeys("Testing Adding Customer feature ");
				Thread.sleep(3000);
				oPage.getSaveCustomerButton().click();
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private static void deleteCustomer()
		{
			try {
				oPage.getclickSettingCustomertoModifyorDelete().click();
				Thread.sleep(3000);
				oPage.getclickActionButtontoDeleteCustomer().click();
				oPage.getclickDeleteCutomer().click();
				Thread.sleep(1000);
				oPage.getClickDeleteCustomerConfirm().click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void createProject()
		{
			try
			{
				oPage.getclickAddNew().click();
				oPage.getclickNewprojectunderADDNew().click();
				Thread.sleep(2000);
				oPage.getGiveProjectnameonnameField().sendKeys("ArtificialIntelligence");
				Thread.sleep(1000);
				oPage.getconfirmCreateproject().click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteProject()
		{
			try
			{
				oPage.getclicksettingsatproject().click();
				Thread.sleep(1000);
				oPage.getclickActionsinProject().click();
				Thread.sleep(1000);
				oPage.getclickDeleteonProject().click();
				Thread.sleep(1000);
				oPage.getconfirmDeleteProject().click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

