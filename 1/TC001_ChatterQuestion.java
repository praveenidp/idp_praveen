package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC001_ChatterQuestion extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Chatter Question";
		testDescription ="Post a question";
		authors="Test";
		category ="Smoke";
		excelFileName="Sf";
	}
	
	@Test(dataProvider = "fetchData")
	public void runChatterQuestion(String username, String password, String question, String details){
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickIcon()
		.clickViewAll()
		.searchContent()
		.clickContent()
		.clickChatter()
		.verifyChatterTitle()
		.clickQuestion()
		.enterQuestion(question)
		.enterDetails(details)
		.clickAsk()
		.verifyQuestion(question);

	}

}
