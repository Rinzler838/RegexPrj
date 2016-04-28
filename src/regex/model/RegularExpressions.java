package regex.model;

import java.util.ArrayList;

public class RegularExpressions
{
	private ArrayList<String> firstList;
	private ArrayList<String> lastList;
	private ArrayList <String> phoneList;
	private ArrayList<String> providerList;
	
	public RegularExpressions()
	{
		this.firstList = new ArrayList<String>();
		this.lastList = new ArrayList<String>();
		this.phoneList = new ArrayList<String>();
		this.providerList = new ArrayList<String>();
		
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
			for (int currentSymbol = 0; currentSymbol < firstList.size(); currentSymbol++)
			{
				if (lastName.contains(lastList.get(currentSymbol)))
				{
					return lastCheck = "Status Code 400: Conatins invalid characters";
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
		String phoneCheck = null;
		
		if (phoneNum.length() == 10)
		{
			phoneCheck = "Status Code 200: ";
			
			for (int letter = 0; letter < phoneNum.length(); letter++)
			{
				for (int currentNum = 0; currentNum < phoneList.size(); currentNum++)
				{
					if (phoneNum.substring(letter, letter + 1).equals(phoneList.get(currentNum).substring(0,1)))
					{
						phoneCheck += "Character" + letter + "is clear, ";
					}
					else
					{
						phoneCheck += "Status Code 400: Character" + letter + "is invalid";
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
		
		if (email.contains("@"))
		{
			for (int currentEmail = 0; currentEmail < providerList.size(); currentEmail++)
			{
				if (email.substring(email.indexOf("@") + 1, email.indexOf(".") + 3).equals(providerList.get(currentEmail)))
				{
					return emailCheck = "Status Code 200: Clear";
				}
			}
		}
		else
		{
			emailCheck = "Status Code 421: Does not contain @ symbol";
		}
		return emailCheck;
	}
}