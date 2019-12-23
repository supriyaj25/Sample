package com.vtiger.genericlib;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;


public abstract class ListeImpClass implements ITestListener {

	

	@Override
	public void onTestFailure(ITestResult result) {
String currentDate=new Date().toString().replace(":","-").replace(":","-");
String FailedTestName=result.getMethod().getMethodName();
System.out.println("==fail=="+FailedTestName);
EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.driver);
File srcfile=edriver.getScreenshotAs(OutputType.FILE);
File detfile =new File("./screenshot/"+FailedTestName+"_"+currentDate+".png");
try
{
	Files.copy(srcfile,detfile);
	}
catch(IOException e)
{
	
}
	}


	
	
	
	

}
