package com.vtiger.userTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.genericlib.BaseClass;

public class OpportunityTest extends BaseClass {
	@Test
	public void OpportunityTest()
	{
		System.out.println("execute opportunity");
		
				//Click on opportunites
			     driver.findElement(By.xpath("//td[@class='small']/../..//a[text()='Opportunities']")).click();
		         //create new opportunities
				 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();

//			     driver.findElement(By.name("potentialname")).sendKeys("Bosch");
//			     driver.findElement(By.xpath("//table[@class='small']/tbody/tr[4]/td[2]/img")).click();
//			     Set<String> set = driver.getWindowHandles();
//			     Iterator<String> i=set.iterator();
//			     String ParentId  =i.next();
//			     String ChildID=i.next();
//			     driver.switchTo().window(ChildID);
//			     driver.findElement(By.xpath("//a[text()='Qspiders']")).click();
//			 	 driver.switchTo().window(ParentId);
//		          driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
//			     //select existing opportunities
//			     driver.findElement(By.xpath("//td[@class='small']/../..//a[text()='Opportunities']")).click();
//			     driver.findElement(By.xpath("//a[@title='Opportunities']")).click();
//			     //move to More Information 
//			   Actions act =new Actions(driver);
//			   act.moveToElement(driver.findElement(By.xpath("//table[@class='small']/../../../..//a[text()='More Information']"))).perform();
//			    //select the sales in the salesStage History
//		        driver.findElement(By.xpath("//a[text()='Sales Stage History']")).click();



			

			
				
			}

	}
	


