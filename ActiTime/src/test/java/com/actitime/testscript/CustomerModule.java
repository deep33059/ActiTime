package com.actitime.testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

//import dev.failsafe.internal.util.Assert;

@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends  BaseClass{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("createcustomer",true);
		//Assert.fail();
		FileLib f=new FileLib();
		String custName = f.getExcelData("CreateCustomer", 1, 3);
		String custoDesig = f.getExcelData("CreateCustomer", 1, 4);
		System.out.println(custName);
		System.out.println(custoDesig);
		
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		Thread.sleep(5000);
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		Thread.sleep(5000);
		t.getNewCustomerBtn().click();
		Thread.sleep(3000);
		t.getEnterCustomerTbx().sendKeys(custName);
		Thread.sleep(3000);
		t.getEnterCustDespTbx().sendKeys(custoDesig);
		Thread.sleep(3000);
		t.getSelectCutDD().click();
		Thread.sleep(3000);
		t.getBigBngCompany().click();
		Thread.sleep(3000);
		t.getCreateCustomerBtn().click();
		Thread.sleep(8000);
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		}
		catch(NoAlertPresentException e)
		{
			
		}
		String actual = t.getVrifiCustNmae().getText();
		  assertEquals(custName, actual);
	}
	

}
