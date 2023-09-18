package com.actitime.testscript;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule extends BaseClass{
	
	//public class CustomerModule {


		@Test
		public void createProject()
		{
			Reporter.log("CreateCustomer",true);
		}
		

		@Test
		public void modifyProject()
		{
			Reporter.log("modifyCustomer",true);
		}
		

		@Test
		public void deleteCustomer()
		{
			Reporter.log("deleteCustomer",true);
		}


}
