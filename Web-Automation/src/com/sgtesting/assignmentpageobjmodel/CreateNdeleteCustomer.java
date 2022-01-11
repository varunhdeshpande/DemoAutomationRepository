package com.sgtesting.assignmentpageobjmodel;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNdeleteCustomer {
	private static WebDriver oBrowser = null;
	private static ActiTimeDemo1 oPage = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		logout();
		closeApplication();

	}

	private static void launchBrowser() {
		try {
			String path = System.getProperty("user.dir");
			Thread.sleep(3000);
			System.setProperty("webdriver.chrome.driver", path + "\\Library\\drivers\\chromedriver.exe");
			Thread.sleep(3000);
			oBrowser = new ChromeDriver();
			Thread.sleep(3000);
			oPage = new ActiTimeDemo1(oBrowser);
			Thread.sleep(3000);
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login() {
		try {
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(3000);
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow() {
		try {
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logout() {
		try {
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeApplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createCustomer() {
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

	static void deleteCustomer() {
		try {
			oPage.getclickSettingCustomertDelete().click();
			Thread.sleep(3000);
			oPage.getclickActionButtontoDeleteCustomer().click();
			oPage.getclickDeleteCutomer().click();
			Thread.sleep(1000);
			oPage.getClickDeleteCustomerConfirm().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
