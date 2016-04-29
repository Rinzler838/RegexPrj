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
		//majorIcon = new ImageIcon(getClass().getResource("Images/mgs.png"));
		//snakeIcon = new ImageIcon(getClass().getResource("Images/snake.jpg"));
	}
	
	public String characterInput(String displayText)
	{
		String userInput = "";
		userInput = JOptionPane.showInputDialog(null, displayText, windowTitle, JOptionPane.PLAIN_MESSAGE, null, null, "Enter text here...") + "";
		return userInput;
	}
	
	public void showMessage(String formativeDisplay)
	{
		JOptionPane.showMessageDialog(null, formativeDisplay, "Colonel Campbell", JOptionPane.INFORMATION_MESSAGE, majorIcon);
	}
	
	public void showResponse(String formativeDisplay)
	{
		JOptionPane.showMessageDialog(null, formativeDisplay, "Snake", JOptionPane.INFORMATION_MESSAGE, snakeIcon);
	}
}
