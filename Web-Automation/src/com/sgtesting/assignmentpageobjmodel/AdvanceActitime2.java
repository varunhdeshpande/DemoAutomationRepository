package com.sgtesting.assignmentpageobjmodel;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceActitime2 {
	private static WebDriver oBrowser=null;
	private static ActiTimeDemo1 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAsAdmin();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		loginAsUser1();
		createUser2();
		logout();
		loginAsUser2();
		createUser3();
		logout();
		loginAsUser3();
		logout();
		loginAsUser2() ;
		modifyUser3();
		logout();
		loginAsUser3sec();
		logout();
		loginAsUser1();
		modifyUser2();
		logout();
		loginAsUser2sec();
		logout();
		loginAsAdmin();
		minimizeFlyOutWindow();
		modifyUser1();
		logout();
		loginAsUser1sec();
		logout();
		loginAsUser2sec();
		deleteUser3();
		logout();
		loginAsUser1sec();
		deleteUser2();
		logout();
		loginAsAdmin();
		minimizeFlyOutWindow();
		deleteUser1();
		logout();
		closeApplication();
	}

	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimeDemo1(oBrowser);
			Thread.sleep(2500);	
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

	private static void loginAsAdmin()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(2500);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(2500);
			oPage.getLoginButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginAsUser1() {
		try {
			oPage.getUserName().sendKeys("User1");
			Thread.sleep(2500);
			oPage.getPassword().sendKeys("pwduser1");
			Thread.sleep(2500);
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(4000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser2() {
		try {
			oPage.getUserName().sendKeys("User2");
			Thread.sleep(2500);
			oPage.getPassword().sendKeys("pwduser2");
			Thread.sleep(2500);
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(4000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser3() {
		try {
			oPage.getUserName().sendKeys("User3");
			Thread.sleep(2500);
			oPage.getPassword().sendKeys("pwduser3");
			Thread.sleep(2500);
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(4000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser1sec() {
		try {
			oPage.getUserName().sendKeys("User1");
			Thread.sleep(2500);
			oPage.getPassword().sendKeys("user1pwd");
			Thread.sleep(2500);
			oPage.getLoginButton().click();
			Thread.sleep(2000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser2sec() {
		try {
			oPage.getUserName().sendKeys("User2");
			Thread.sleep(2500);
			oPage.getPassword().sendKeys("user2pwd");
			Thread.sleep(2500);
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void loginAsUser3sec() {
		try {
			oPage.getUserName().sendKeys("User3");
			Thread.sleep(2500);
			oPage.getPassword().sendKeys("user3pwd");
			Thread.sleep(2500);
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oPage.getXploreActimeIcon().click();
			Thread.sleep(2000);

		}catch (Exception e) {
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

	private static void createUser1()
	{
		try
		{
			Thread.sleep(1000);
			oPage.getCreateUserButton().click();
			Thread.sleep(2000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(2000);
			oPage.getAddUserFirstName().sendKeys("var");
			Thread.sleep(2500);
			oPage.getAddUserLastName().sendKeys("U1");
			Thread.sleep(2500);
			oPage.getAddUserEmail().sendKeys("abc@gmail.com");
			Thread.sleep(2500);
			oPage.getUserName().sendKeys("User1");
			Thread.sleep(2500);
			oPage.getAddUserPassword().sendKeys("pwduser1");
			Thread.sleep(2500);
			oPage.getAddUserRetypePassword().sendKeys("pwduser1");
			Thread.sleep(2000);
			oPage.getCreateUserCreateButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser2(){
		try {

			oPage.getCreateUserButton().click();
			Thread.sleep(4000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(2000);
			oPage.getAddUserFirstName().sendKeys("Kar");
			Thread.sleep(2500);
			oPage.getAddUserLastName().sendKeys("U2");
			Thread.sleep(2500);
			oPage.getAddUserEmail().sendKeys("abc@gmail.com");
			Thread.sleep(2500);
			oPage.getUserName().sendKeys("User2");
			Thread.sleep(2500);
			oPage.getAddUserPassword().sendKeys("pwduser2");
			oPage.getAddUserRetypePassword().sendKeys("pwduser2");
			Thread.sleep(3000);
			oPage.getCreateUserCreateButton().click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser3(){
		try {

			oPage.getCreateUserButton().click();
			Thread.sleep(4000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(2500);
			oPage.getAddUserFirstName().sendKeys("pri");
			Thread.sleep(2500);
			oPage.getAddUserLastName().sendKeys("U3");
			Thread.sleep(2500);
			oPage.getAddUserEmail().sendKeys("abc@gmail.com");
			Thread.sleep(2500);
			oPage.getUserName().sendKeys("User3");
			Thread.sleep(2500);
			oPage.getAddUserPassword().sendKeys("pwduser3");
			Thread.sleep(2500);
			oPage.getAddUserRetypePassword().sendKeys("pwduser3");
			Thread.sleep(6000);
			oPage.getCreateUserCreateButton().click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyUser1(){
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(2500);
			oPage.getClickOnUser1().click();
			Thread.sleep(2500);
			oPage.getAddUserPassword().clear();
			Thread.sleep(2500);
			oPage.getAddUserPassword().sendKeys("user1pwd");
			Thread.sleep(2500);
			oPage.getAddUserRetypePassword().clear();
			Thread.sleep(2500);
			oPage.getAddUserRetypePassword().sendKeys("user1pwd");
			Thread.sleep(2000);
			oPage.getCreateUserCreateButton().click();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void modifyUser2(){
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(1500);
			oPage.getClickOnUser2().click();
			Thread.sleep(1500);
			oPage.getAddUserPassword().clear();
			Thread.sleep(1500);
			oPage.getAddUserPassword().sendKeys("user2pwd");
			Thread.sleep(1500);
			oPage.getAddUserRetypePassword().clear();
			Thread.sleep(1500);
			oPage.getAddUserRetypePassword().sendKeys("user2pwd");
			Thread.sleep(2000);
			oPage.getCreateUserCreateButton().click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyUser3() {
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(1500);
			oPage.getClickOnUser3().click();
			Thread.sleep(1500);
			oPage.getAddUserPassword().clear();
			Thread.sleep(1500);
			oPage.getAddUserPassword().sendKeys("user3pwd");
			Thread.sleep(1500);
			oPage.getAddUserRetypePassword().clear();
			Thread.sleep(1500);
			oPage.getAddUserRetypePassword().sendKeys("user3pwd");
			Thread.sleep(2000);
			oPage.getCreateUserCreateButton().click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void deleteUser1() {
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(5000);
			oPage.getClickOnUser1().click();
			Thread.sleep(2000);
			oPage.getDeleteUserDeleteButton().click();
			Thread.sleep(1500);
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(2000);
			oa.accept();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void deleteUser2() {
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(5000);
			oPage.getClickOnUser2().click();
			Thread.sleep(2000);
			oPage.getDeleteUserDeleteButton().click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(2000);
			oa.accept();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void deleteUser3() {
		try {
			oPage.getCreateUserButton().click();
			Thread.sleep(5000);
			oPage.getClickOnUser3().click();
			Thread.sleep(2000);
			oPage.getDeleteUserDeleteButton().click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(2000);
			oa.accept();
			Thread.sleep(4000);
		} catch (Exception e) {
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
}