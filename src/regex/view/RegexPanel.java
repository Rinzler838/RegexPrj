package regex.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import regex.controller.RegexController;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JButton checkButton;
	private JTextField firstField;
	private JTextField lastField;
	private JTextField phoneField;
	private JTextField emailField;
	private JLabel firstLabel;
	private JLabel lastLabel;
	private JLabel phoneLabel;
	private JLabel emailLabel;
	
	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		checkButton = new JButton("Check");
		firstField = new JTextField(25);
		lastField = new JTextField(25);
		phoneField = new JTextField(25);
		emailField = new JTextField(25);
		firstLabel = new JLabel("");
		lastLabel = new JLabel("");
		phoneLabel = new JLabel("");
		emailLabel = new JLabel("");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(checkButton);
		this.add(firstField);
		this.add(lastField);
		this.add(phoneField);
		this.add(emailField);
		this.add(firstLabel);
		this.add(lastLabel);
		this.add(phoneLabel);
		this.add(emailLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		checkButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String firstName = firstField.getText();
				firstLabel.setText();
				String lastName = lastField.getText();
				lastLabel.setText();
				String phoneNum = phoneField.getText();
				phoneLabel.setText();
				String email = emailField.getText();.
				emailLabel.setText();
			}
		});
	}
}
