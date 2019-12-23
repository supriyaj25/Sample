package com.vtiger.objectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Opportunities {
	@FindBy(xpath="//td[@class='small']/../..//a[text()='Opportunities']")
	private WebElement OpportunityClk;

	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement OpportunityCreate;
			
}
