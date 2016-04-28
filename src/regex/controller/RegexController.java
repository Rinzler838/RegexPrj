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
		return firstName;
		
	}
	
	public String processLastName(String lastName)
	{
		return lastName;
		
	}
	
	public String processPhoneNumber(String PhoneNum)
	{
		return PhoneNum;
		
	}
	
	public String processEmail(String email)
	{
		return email;
		
	}
}
