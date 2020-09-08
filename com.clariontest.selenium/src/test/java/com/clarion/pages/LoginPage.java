package com.clarion.pages;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(name="txtUsername")WebElement uname;
	@FindBy(name="txtPassword")WebElement pass;
	@FindBy(className="button_white")WebElement logButton;
	@FindBy(xpath="/html/body/table/tbody/tr[5]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[3]/td/font")WebElement erormessage;
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/td[3]/table/tbody/tr[1]/td/a[3]") WebElement promiseapp;
	@FindBy(xpath="/html/body/table/tbody/tr[5]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td/ul/li[1]/a")WebElement addPromise;
	@FindBy(name="cboEmp")WebElement selectPromisor;
	@FindBy(id="txtPromise")WebElement promisorText;
	@FindBy(id="btnSubmit") WebElement logPromise;
	
	@FindBy(xpath="html/body")WebElement ele12;
	
	@FindBy(xpath="/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr[2]/td[3]") By ele1;
	
	@FindBy(xpath="/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr[3]/td[3]")WebElement promiseTable;
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/td[3]/table/tbody/tr[1]/td/a[3]")WebElement logout;
	public void LogintoPromiseValidate(String usernamePromise , String passwordPromise)
	{
	/*	try{
		Thread.sleep(2000);
		}catch(InterruptedException e){
			
		}*/
		uname.sendKeys(usernamePromise);
		pass.sendKeys(passwordPromise);
		logButton.click();
		String actual_error=erormessage.getText();
		String expected_error="Invalid Username/password";
		
		Assert.assertEquals(expected_error, actual_error);
		
		System.out.println("test validation completed");
	}
	
	public void LogintoPromise(String usernamePromise1 , String passwordPromise1)
	{
		/*try{
			Thread.sleep(2000);
			}catch(InterruptedException e){
				
			}*/
		uname.sendKeys(usernamePromise1);
		pass.sendKeys(passwordPromise1);
		logButton.click();
		
		String actual_page=promiseapp.getText();
		String expected_page="LOGOUT";
        Assert.assertEquals(expected_page, actual_page);
		
		System.out.println("page validation completed");
		
	
		
	}
	
	public void addPromiseLog(){
		/*try{
			Thread.sleep(2000);
			}catch(InterruptedException e){
				
			}*/
		
		addPromise.click();
		Select addPromisor = new Select(selectPromisor);
		addPromisor.selectByVisibleText("Sonali test");
		
		promisorText.sendKeys("Hello This is for testing123454565612300");
		logPromise.click();
			
	}
	


	/*public void verufyPromise() {
		
		String acual_text=promiseTable.getText();
		String expected_text="	fhfhhyuuAAAAA";
		
		 Assert.assertEquals(expected_text, acual_text);
		System.out.println("hiii"+promiseTable.getText());
		
		//WebElement webtable=driver.findElement(By.xpath(“html/body”));
		List<WebElement>rows=ele12.findElements(ele1);

		System.out.println("Number of Rows including headings:"+ rows.size());
	}*/
	
	public void logOut()
	{
		logout.click();
		
	}
	
	

}
