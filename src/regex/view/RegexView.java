package regex.view;

import javax.swing.JOptionPane;

public class RegexView
{
	private String windowTitle;
	
	public RegexView()
	{
		windowTitle = "REGEX: Regular Expressions";
	}
	
	public String characterInput(String displayText)
	{
		String userInput = "";
		userInput = JOptionPane.showInputDialog(null, displayText, windowTitle, JOptionPane.PLAIN_MESSAGE, null, null, "Enter text here...") + "";
		return userInput;
	}
	
	public void showMessage(String formativeDisplay)
	{
		JOptionPane.showMessageDialog(null, formativeDisplay, windowTitle, JOptionPane.INFORMATION_MESSAGE);
	}
}
