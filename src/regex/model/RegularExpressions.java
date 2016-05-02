package regex.model;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions
{
	private ArrayList<String> firstList;
	private ArrayList<String> lastList;
	private ArrayList <String> phoneList;
	private ArrayList<String> providerList;
	private Pattern emailPattern;
	private Matcher emailMatcher;
	
	public RegularExpressions()
	{
		this.firstList = new ArrayList<String>();
		this.lastList = new ArrayList<String>();
		this.phoneList = new ArrayList<String>();
		this.providerList = new ArrayList<String>();
		emailPattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		
		buildFirstList();
		buildLastList();
		buildPhoneList();
		buildProviderList();
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
	}
	
	private void buildPhoneList()
	{
		this.phoneList.add("0");
		this.phoneList.add("1");
		this.phoneList.add("2");
		this.phoneList.add("3");
		this.phoneList.add("4");
		this.phoneList.add("5");
		this.phoneList.add("6");
		this.phoneList.add("7");
		this.phoneList.add("8");
		this.phoneList.add("9");
	}
	
	private void buildProviderList()
	{
		this.providerList.add("gmail.com");
		this.providerList.add("yahoo.com");
		this.providerList.add("aol.com");
		this.providerList.add("msn.com");
		this.providerList.add("facebook.com");
		this.providerList.add("mail.com");
		this.providerList.add("comcast.net");
		this.providerList.add("hotmail.com");
		this.providerList.add("verizon.net");
		this.providerList.add("gmx.com");
		this.providerList.add("live.com");
		this.providerList.add("att.net");
		this.providerList.add("hushmail.com");
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
		
		if (phoneNum.length() == 10)
		{	
			for (int currentNum = 1; currentNum < phoneList.size(); currentNum++)
			{
				for (int letter = 1; letter < phoneNum.length(); letter++)
				{
					if (phoneNum.substring(letter, letter + 1).equals(phoneList.get(currentNum).substring(0,1)))
					{
						return phoneCheck += letter + ", ";
					}
					else
					{
						phoneCheck += "X, ";
					}
				}
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
		String emailCheck = null;
		
		emailMatcher = emailPattern.matcher(email);
		
		if (emailMatcher.matches() == true)
		{
			emailCheck = "Status Code 200: Clear";
		}
		return emailCheck;
	}
}

//if (email.contains("@"))
//{
//	for (int currentEmail = 0; currentEmail < providerList.size(); currentEmail++)
//	{
//		if (email.substring(email.indexOf("@") + 1, email.length()).equals(providerList.get(currentEmail)))
//		{
//			return emailCheck = "Status Code 200: Clear";
//		}
//	}
//}
//else
//{
//	emailCheck = "Status Code 421: Does not contain @ symbol";
//}
