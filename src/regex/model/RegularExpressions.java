package regex.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
	private ArrayList<String> firstList;
	private ArrayList<String> lastList;
	private ArrayList <String> phoneList;
	private ArrayList<String> providerList;
	private Matcher emailMatcher;
	private Pattern emailPattern;
	private Matcher phoneMatcher;
	private Pattern phonePattern;
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String PHONE_PATTERN = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	
	
	public RegularExpressions()
	{
		this.firstList = new ArrayList<String>();
		this.lastList = new ArrayList<String>();
		this.phoneList = new ArrayList<String>();
		this.providerList = new ArrayList<String>();
		this.emailPattern = Pattern.compile(EMAIL_PATTERN);
		this.phonePattern = Pattern.compile(PHONE_PATTERN);
		
		buildFirstList();
		buildLastList();
	}
	
	private void buildFirstList()
	{
		this.firstList.add("!");
		this.firstList.add("@");
		this.firstList.add("#");
		this.firstList.add("$");
		this.firstList.add("%");
		this.firstList.add("^");
		this.firstList.add("&");
		this.firstList.add("*");
		this.firstList.add("(");
		this.firstList.add(")");
		this.firstList.add("-");
		this.firstList.add("_");
		this.firstList.add("+");
		this.firstList.add("=");
		this.firstList.add("`");
		this.firstList.add("~");
		this.firstList.add("[");
		this.firstList.add("]");
		this.firstList.add("{");
		this.firstList.add("}");
		this.firstList.add("\\");
		this.firstList.add("|");
		this.firstList.add(",");
		this.firstList.add(".");
		this.firstList.add("<");
		this.firstList.add(">");
		this.firstList.add("/");
		this.firstList.add("?");
		this.firstList.add(";");
		this.firstList.add("'");
		this.firstList.add(":");
		this.firstList.add("\"");
		this.firstList.add(" ");
		
	}
	
	private void buildLastList()
	{
		this.lastList.add("!");
		this.lastList.add("@");
		this.lastList.add("#");
		this.lastList.add("$");
		this.lastList.add("%");
		this.lastList.add("^");
		this.lastList.add("&");
		this.lastList.add("*");
		this.lastList.add("(");
		this.lastList.add(")");
		this.lastList.add("_");
		this.lastList.add("+");
		this.lastList.add("=");
		this.lastList.add("`");
		this.lastList.add("~");
		this.lastList.add("[");
		this.lastList.add("]");
		this.lastList.add("{");
		this.lastList.add("}");
		this.lastList.add("\\");
		this.lastList.add("|");
		this.lastList.add("<");
		this.lastList.add(">");
		this.lastList.add("/");
		this.lastList.add("?");
		this.lastList.add(";");
		this.lastList.add("'");
		this.lastList.add(":");
		this.lastList.add("\"");
		this.lastList.add(" ");
	}
	
	public String firstNameChecker(String firstName)
	{
		String firstCheck = null;
		
		if (firstName.length() > 2 && firstName.length() < 30)
		{
			for (int currentSymbol = 0; currentSymbol < firstList.size(); currentSymbol++)
			{
				if (firstName.contains(firstList.get(currentSymbol)))
				{
					return firstCheck = "Status Code 400: Contains invalid character";
				}
				else
				{
					firstCheck = "Status Code 200: Clear";
				}
			}
		}
		else
		{
			firstCheck = "Status Code 413: Entry is too long or short";
		}
		return firstCheck;
	}
	
	public String lastNameChecker(String lastName)
	{
		String lastCheck = null;
		
		if (lastName.length() > 2 && lastName.length() < 40)
		{
			for (int currentSymbol = 0; currentSymbol < lastList.size(); currentSymbol++)
			{
				if (lastName.contains(lastList.get(currentSymbol)))
				{
					lastCheck = "Status Code 400: Conatins invalid characters";
				}
				else
				{
					lastCheck = "Status Code 200: Clear";
				}
			}
		}
		else
		{
			lastCheck = "Status Code 413: Entry is too long or short";
		}
		return lastCheck;
	}
	
	public String phoneNumChecker(String phoneNum)
	{
		String phoneCheck = "";
		
		phoneMatcher = phonePattern.matcher(phoneNum);
		
		if (phoneNum.length() == 10)
		{	
			if (phoneMatcher.matches() == true)
			{
				phoneCheck = "Status Code 200: Clear";
			}
			else
			{
				phoneCheck = "Status Code 400: Invalid Entry";
			}
		}
		else
		{
			phoneCheck = "Status Code 413: Entry is too long or short";
		}
		return phoneCheck;
	}
	
	public String emailChecker(String email)
	{
		String emailCheck = "";
		
		emailMatcher = emailPattern.matcher(email);
		
		if (emailMatcher.matches() == true)
		{
			return emailCheck = "Status Code 200: Clear";
		}
		else
		{
			return emailCheck = "Status Code 400: Invalid Entry";
		}
	}
}
