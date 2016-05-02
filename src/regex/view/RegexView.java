package regex.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegexView
{
	private String windowTitle;
	private ImageIcon majorIcon;
	private ImageIcon snakeIcon;
	
	public RegexView()
	{
		windowTitle = "REGEX: Regular Expressions";
		majorIcon = new ImageIcon(getClass().getResource("images/mgs.png"));
		snakeIcon = new ImageIcon(getClass().getResource("images/snake.jpg"));
	}
	
	public String characterInput(String regexText)
	{
		String userInput = "";
		userInput = JOptionPane.showInputDialog(null, regexText, windowTitle, JOptionPane.PLAIN_MESSAGE, null, null, "Enter text here...") + "";
		return userInput;
	}
	
	public void showMessage(String regexDisplay)
	{
		JOptionPane.showMessageDialog(null, regexDisplay, "Colonel Campbell", JOptionPane.INFORMATION_MESSAGE, majorIcon);
	}
	
	public void showResponse(String regexDisplay)
	{
		JOptionPane.showMessageDialog(null, regexDisplay, "Snake", JOptionPane.INFORMATION_MESSAGE, snakeIcon);
	}
}
