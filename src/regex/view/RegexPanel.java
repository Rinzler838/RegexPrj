package regex.view;

import java.awt.Color;
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
		checkButton = new JButton("Verify");
		
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
		this.setBackground(Color.BLACK);
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
		baseLayout.putConstraint(SpringLayout.SOUTH, checkButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, checkButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstField, 0, SpringLayout.WEST, lastField);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstField, -28, SpringLayout.NORTH, lastField);
		baseLayout.putConstraint(SpringLayout.WEST, lastField, 0, SpringLayout.WEST, phoneField);
		baseLayout.putConstraint(SpringLayout.SOUTH, lastField, -23, SpringLayout.NORTH, phoneField);
		baseLayout.putConstraint(SpringLayout.WEST, phoneField, 0, SpringLayout.WEST, emailField);
		baseLayout.putConstraint(SpringLayout.SOUTH, phoneField, -27, SpringLayout.NORTH, emailField);
		baseLayout.putConstraint(SpringLayout.WEST, emailField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, emailField, -31, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 0, SpringLayout.SOUTH, firstField);
		baseLayout.putConstraint(SpringLayout.WEST, firstLabel, 0, SpringLayout.WEST, firstField);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstLabel, 0, SpringLayout.NORTH, lastField);
		baseLayout.putConstraint(SpringLayout.EAST, firstLabel, 0, SpringLayout.EAST, firstField);
		baseLayout.putConstraint(SpringLayout.NORTH, lastLabel, 0, SpringLayout.SOUTH, lastField);
		baseLayout.putConstraint(SpringLayout.WEST, lastLabel, 0, SpringLayout.WEST, lastField);
		baseLayout.putConstraint(SpringLayout.SOUTH, lastLabel, 0, SpringLayout.NORTH, phoneField);
		baseLayout.putConstraint(SpringLayout.EAST, lastLabel, 0, SpringLayout.EAST, lastField);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneLabel, 0, SpringLayout.SOUTH, phoneField);
		baseLayout.putConstraint(SpringLayout.WEST, phoneLabel, 0, SpringLayout.WEST, phoneField);
		baseLayout.putConstraint(SpringLayout.SOUTH, phoneLabel, 0, SpringLayout.NORTH, emailField);
		baseLayout.putConstraint(SpringLayout.EAST, phoneLabel, 0, SpringLayout.EAST, phoneField);
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 0, SpringLayout.SOUTH, emailField);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, emailField);
		baseLayout.putConstraint(SpringLayout.SOUTH, emailLabel, 0, SpringLayout.SOUTH, checkButton);
		baseLayout.putConstraint(SpringLayout.EAST, emailLabel, 0, SpringLayout.EAST, emailField);
	}
	
	private void setupListeners()
	{
		checkButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String firstName = firstField.getText();
				String firstStatus = baseController.processFirstName(firstName);
				firstLabel.setForeground(Color.WHITE);
				firstLabel.setText(firstStatus);
				
				String lastName = lastField.getText();
				String lastStatus = baseController.processLastName(lastName);
				firstLabel.setForeground(Color.WHITE);
				lastLabel.setText(lastStatus);
				
				String phoneNum = phoneField.getText();
				String phoneStatus = baseController.processPhoneNumber(phoneNum);
				firstLabel.setForeground(Color.WHITE);
				phoneLabel.setText(phoneStatus);
				
				String email = emailField.getText();
				String emailStatus = baseController.processEmail(email);
				firstLabel.setForeground(Color.WHITE);
				emailLabel.setText(emailStatus);
			}
		});
	}
}
