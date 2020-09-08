package com.clariontest.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.clarion.pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	
	
	@Test( priority=0)
	public void loginAppValidate()
	{
		driver=BrowserHistory.startApplication(driver, "Chrome", "http://182.74.238.221/clarion_promise_qa/home.php");
		
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		//LoginPage validate=PageFactory.initElements(driver, LoginPage.class);
		loginpage.LogintoPromiseValidate("", "");
		
		
		BrowserHistory.quitBrowser(driver);
	}
	
	
	@Test( priority=1)
	public void loginApp()
	{
		//driver=BrowserHistory.startApplication(driver, "Chrome", "http://182.74.238.221/clarion_promise_qa/home.php");
	//	System.out.println(driver.getTitle());
		
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		//LoginPage validate=PageFactory.initElements(driver, LoginPage.class);
		loginpage.LogintoPromise("sanjeetk@clariontechnologies.co.in", "clarion");
		//validate.validate("", "");
		BrowserHistory.quitBrowser(driver);
	}
	@Test( priority=2)
	public void addpromise()
	{
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.addPromiseLog();
		
		
		
		BrowserHistory.quitBrowser(driver);
	}
	
	/*@Test( priority=3)
	public void verifyPromiseAdd()
	{
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.verufyPromise();
		
		
		
		BrowserHistory.quitBrowser(driver);
	}*/
	
	@Test( priority=3)
	public void LogOut()
	{
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		loginpage.logOut();
		
		
		
		BrowserHistory.quitBrowser(driver);
	}
	
	
	
}
