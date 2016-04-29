package regex.controller;

import regex.model.RegularExpressions;
import regex.view.RegexFrame;
import regex.view.RegexView;

public class RegexController
{
	private RegularExpressions regex;
	public String firstName;
	public String lastName;
	public String phoneNum;
	public String email;
	private RegexView regexDisplay;
	private RegexFrame regexFrame;
	
	public RegexController()
	{
		regex = new RegularExpressions();
		regexDisplay = new RegexView();
		regexFrame = new RegexFrame(this);
	}
	
	public void start()
	{
		regexDisplay.showMessage("Here's the situation Snake: Security's been breached and we've lost integrity.");
		regexDisplay.showMessage("Go ahead and re-verify your info in the next window.");
		regexDisplay.showResponse("Roger that Colonel");
	}
	
	public String processFirstName(String firstName)
	{
		String firstStatus = "";
		firstStatus = regex.firstNameChecker(firstName);
		return firstStatus;
		
	}
	
	public String processLastName(String lastName)
	{
		String lastStatus = "";
		lastStatus = regex.lastNameChecker(lastName);
		return lastStatus;
		
	}
	
	public String processPhoneNumber(String phoneNum)
	{
		String phoneStatus = "";
		phoneStatus = regex.phoneNumChecker(phoneNum);
		return phoneStatus;
		
	}
	
	public String processEmail(String email)
	{
		String emailStatus = "";
		emailStatus = regex.emailChecker(emailStatus);
		return emailStatus;
		
	}
}
