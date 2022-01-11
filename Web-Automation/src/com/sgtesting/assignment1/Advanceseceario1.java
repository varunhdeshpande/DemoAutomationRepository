package com.sgtesting.assignment1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Advanceseceario1 {
	public static WebDriver wb;
	public static void main(String[] args) {

		LaunchBrowser();
		navigate();
		loginadmin();
		createusers1();
		createusers2();
		createusers3();
		logoutadmin();
		loginUser1();
		logoutUser1();
		loginUser2();
		logoutUser2();
		loginUser3();
		logoutUser3();
		loginadmin1();
		modifyPassword();
		logoutadmin();
		loginUserUpdated1();
		logoutUser1();
		loginUserUpdated2();
		logoutUser2();
		loginUserUpdated3();
		logoutUser3();
	}
	static void LaunchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomations\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			wb = new ChromeDriver();
			System.out.println("Browser launched successfull");
			Thread.sleep(5000);
			wb.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void navigate() {
		try {
			wb.get("http://localhost:81/login.do");
			Thread.sleep(3000);
			System.out.println("Navigation successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginadmin() {
		try {
			wb.findElement(By.id("username")).sendKeys("admin");
			wb.findElement(By.name("pwd")).sendKeys("manager");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			wb.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(5000);
			System.out.println("Login admin successfull");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginadmin1() {
		try {
			wb.findElement(By.id("username")).sendKeys("admin");
			wb.findElement(By.name("pwd")).sendKeys("manager");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			System.out.println("Login admin successfull");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createusers1() {
		try {
			wb.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			wb.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("Demo");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("User1");
			wb.findElement(By.xpath("//*[@id='userDataLightBox_emailField']")).sendKeys("abs@gmail.com");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("User1");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abs");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abs");
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			System.out.println("User 1 creation done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void createusers2() {
		try {
			wb.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			wb.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("Demo");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("User2");
			wb.findElement(By.xpath("//*[@id='userDataLightBox_emailField']")).sendKeys("abs@gmail.com");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("User2");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abs");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abs");
			wb.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			System.out.println("User 2 creation done");

		} catch (Exception w) {
			w.printStackTrace();
		}
	}

	static void createusers3() {
		try {
			wb.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			wb.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("Demo");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("User3");
			wb.findElement(By.xpath("//*[@id='userDataLightBox_emailField']")).sendKeys("abs@gmail.com");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("User3");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abs");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abs");

			wb.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);

			System.out.println("User 3 creation done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void logoutadmin() {
		wb.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		System.out.println("Logout admin user");

	}

	static void loginUser1() {
		try {
			wb.findElement(By.id("username")).sendKeys("User1");
			wb.findElement(By.name("pwd")).sendKeys("abs");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			//			wb.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();

			wb.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
			System.out.println("Login user1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginUserUpdated1() {
		try {
			wb.findElement(By.id("username")).sendKeys("User1");
			wb.findElement(By.name("pwd")).sendKeys("abc");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			wb.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(3000);
			System.out.println("Login user 1 updated");
			wb.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginUserUpdated2() {
		try {
			wb.findElement(By.id("username")).sendKeys("User2");
			wb.findElement(By.name("pwd")).sendKeys("abc");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			wb.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(3000);
			System.out.println("Login user 2 updated");

			wb.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginUserUpdated3() {
		try {
			wb.findElement(By.id("username")).sendKeys("User3");
			wb.findElement(By.name("pwd")).sendKeys("abc");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			wb.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(3000);
			System.out.println("Login user 3 updated");

			wb.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void logoutUser1() {
		try {
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id='logoutLink']")).click();
			System.out.println("Logout user 1");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginUser2() {
		try {
			wb.findElement(By.id("username")).sendKeys("User2");
			wb.findElement(By.name("pwd")).sendKeys("abs");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			wb.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			wb.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
			System.out.println("Login user 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void logoutUser2() {
		try {
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			System.out.println("Logout user 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void loginUser3() {
		try {
			wb.findElement(By.id("username")).sendKeys("User3");
			wb.findElement(By.name("pwd")).sendKeys("abs");
			wb.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(4000);
			wb.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			wb.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
			System.out.println("Login user 3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void logoutUser3() {
		try {
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			System.out.println("Logout user 3");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void modifyPassword() {
		try {
			wb.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			wb.findElement(By.xpath("//span[text()='User3, Demo']")).click();
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abc");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abc");
			wb.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(4000);
			System.out.println("User 3 password is modified to abc");

			wb.findElement(By.xpath("//span[text()='User2, Demo']")).click();
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abc");
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abc");
			wb.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(4000);
			System.out.println("User 2 password is modified to abc");

			wb.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			wb.findElement(By.xpath("//span[text()='User1, Demo']")).click();
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abc");
			Thread.sleep(2000);
			wb.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abc");
			wb.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div")).click();
			Thread.sleep(4000);
			System.out.println("User 1 password is modified to abc");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





