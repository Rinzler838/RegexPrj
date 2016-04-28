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
		regexDisplay.showMessage("Here's the situation Snake: security's been down for sometime now. Go ahead and verify your info in the next window.");
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
