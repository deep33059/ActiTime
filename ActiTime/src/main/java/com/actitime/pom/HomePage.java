package com.actitime.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskTab;
	
	@FindBy(xpath="//div[@id='container_tt']")
	private WebElement TimeTrackTab;
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement UsersTab;
	
	@FindBy(xpath="//div[@id='container_reports']")
	private WebElement ReportrsTab;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement lgoBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setLogOut()
	{
		lgoBtn.click();
	}
		public void setTaskTab()
		{
		taskTab.click();
		}
		
		public void setTimeTrackTab()
		{
			TimeTrackTab.click();
		}
		
		public void setUsersTab()
		{
			UsersTab.click();
		}
		
		public void setReportrsTab()
		{
			ReportrsTab.click();
		}
		
		
		
		
	}


