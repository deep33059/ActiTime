package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerBtn;
	
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerTbx; 
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDespTbx;
	
	@FindBy(xpath="//div[@class='comboboxButton']/div[@class='dropdownButton']")
	private WebElement selectCutDD;
	

	@FindBy(xpath="//div[@class='searchItemList']/div[text()='Big Bang Company']")
	private WebElement bigBngCompany;
	
	
	
	@FindBy(xpath="//div[@class='components_button withPlusIcon']/div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[text()='HDFC_001']")
	private WebElement vrifiCustNmae;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getEnterCustomerTbx() {
		return enterCustomerTbx;
	}

	public WebElement getEnterCustDespTbx() {
		return enterCustDespTbx;
	}

	public WebElement getSelectCutDD() {
		return selectCutDD;
	}
	public WebElement getBigBngCompany() {
		return bigBngCompany;
	}
	
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getVrifiCustNmae() {
		return vrifiCustNmae;
	}

}
