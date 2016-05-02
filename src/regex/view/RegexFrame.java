package regex.view;

import javax.swing.JFrame;

import regex.controller.RegexController;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel basePanel;

	public RegexFrame(RegexController baseController)
	{
		this.baseController = baseController;
		basePanel = new RegexPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 300);
		this.setTitle("CODEC: Port 165.12 - Connection Secure");
		this.setResizable(false);
		this.setVisible(true);
	}
}
