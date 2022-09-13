package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ChatPage extends ProjectSpecificMethods {
	
	public ChattPage verifyChattTitle() {
		pause(300);
		verifyTitle("Chatter Home | Salesforce");
		reportStep("Expected title is displayed","pass");
		return this;
	}
	
	public ChattPage clickQuestion() {
		click(locateElement(Locators.XPATH, "//span[text()='Question']"));
		reportStep("Question tab is clicked successfully","pass");
		return this;
	}
	
	public ChattPage enterQuestion(String data) {
		clearAndType(locateElement(Locators.XPATH, "//textarea[@role='textbox']"), data);
		reportStep("Question is entered successfully","pass");
		return this;

	}
	
	public ChattPage enterDetails(String data) {
		clearAndType(locateElement(Locators.XPATH, "//div[@role='textbox']"), data);
		reportStep("Details are entered successfully","pass");
		return this;

	}
	public ChattPage clickAsk() {
		click(locateElement(Locators.XPATH, "//button[text()='Ask']"));
		reportStep("Ask button is clicked successfully","pass");
		return this;
	}
	
	public ChattPage verifyQuestion(String data) {
		verifyExactText(locateElement(Locators.XPATH,"//span[text()='"+data+"']"), data);
		reportStep(data+" is matching with value provided", "pass");
		return this;
		
	}

	
	
	
	
}
