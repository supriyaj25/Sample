package com.vtiger.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vtiger.objectRepoLib.Login;

public class BaseClass {
public static WebDriver driver;
public Filelib flib=new Filelib();
@BeforeClass

public void configBc() throws Throwable	
{
	System.out.println("===Launch Browser===");
	String BROWSERNAME=flib.getPropertyKeyValue("browser");
			if(BROWSERNAME.equals("firefox")) {
				driver=new FirefoxDriver();
			}
			else if(BROWSERNAME.equals("chrome")) {
				driver=new FirefoxDriver();
			}
	driver=new FirefoxDriver();
}
@BeforeMethod
public void ConfigBm() throws Throwable
{
	System.out.println("===login===");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String URL=flib.getPropertyKeyValue("url");
			//driver.get("http://localhost:8888/");
	//login
//			driver.findElement(By.name("user_name")).sendKeys("admin");
//			driver.findElement(By.name("user_password")).sendKeys("root");
//			driver.findElement(By.id("submitButton")).click();
	String USERNAME=flib.getPropertyKeyValue("username"); 

	String PASSWORD =flib.getPropertyKeyValue("password");
	driver.get(URL);
	
	//create an object login pom class
	Login lp=PageFactory.initElements(driver, Login.class);
	lp.getUserNameEdt().sendKeys("admin");
	lp.getPasswordEdt().sendKeys("root");
	lp.getSubmitEdt().click();
}


@AfterMethod
public void configAm()
{
	System.out.println("===logout===");
	//driver.findElement(arg0)
	}
@AfterClass
public void configAC()
{
	System.out.println("==close browser==");
	}
}
