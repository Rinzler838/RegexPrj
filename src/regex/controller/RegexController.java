package regex.controller;

import regex.model.RegularExpressions;
import regex.view.RegexView;

public class RegexController
{
	private RegularExpressions regex;
	public String firstName;
	public String lastName;
	public String phoneNum;
	public String email;
	private RegexView regexDisplay;
	
	public RegexController()
	{
		regex = new RegularExpressions();
		regexDisplay = new RegexView();
	}
	
	public void start()
	{
		
	}
}
