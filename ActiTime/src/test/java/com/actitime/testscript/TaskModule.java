package com.actitime.testscript;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule extends BaseClass {
	//public class CustomerModule {


		@Test
		public void createTask()
		{
			Reporter.log("CreateCustomer",true);
		}
		

		@Test
		public void modifyTask()
		{
			Reporter.log("modifyCustomer",true);
		}
		

		@Test
		public void deleteTask()
		{
			Reporter.log("deleteCustomer",true);
		}


}
