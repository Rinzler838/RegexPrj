package regex.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegexView
{
	private String windowTitle;
	private ImageIcon regexIcon;
	
	public RegexView()
	{
		windowTitle = "REGEX: Regular Expressions";
		regexIcon = new ImageIcon(getClass().getResource("images/mgs.png"));
	}
	
	public String characterInput(String displayText)
	{
		String userInput = "";
		userInput = JOptionPane.showInputDialog(null, displayText, windowTitle, JOptionPane.PLAIN_MESSAGE, regexIcon, null, "Enter text here...") + "";
		return userInput;
	}
	
	public void showMessage(String formativeDisplay)
	{
		JOptionPane.showMessageDialog(null, formativeDisplay, windowTitle, JOptionPane.INFORMATION_MESSAGE, regexIcon);
	}
}
