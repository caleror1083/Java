import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ReadFile extends JFrame
	{
		private JTextField addressBar;
		private JEditorPane display;
		private static final long serialVersionUID = 1L;
		
		public ReadFile()
			{
				super("Browser");
				addressBar = new JTextField("Enter a URL!");
				addressBar.addActionListener
					(
						new ActionListener()
							{
								public void actionPerformed(ActionEvent event)
									{
										loadCrap(event.getActionCommand());
									}
							}
					);
				add(addressBar, BorderLayout.NORTH);
				display = new JEditorPane();
				display.setEditable(false);
				display.addHyperlinkListener
					(
						new HyperlinkListener()
							{
								public void hyperlinkUpdate(HyperlinkEvent event)
									{
										if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
											{
												loadCrap(event.getURL().toString());
											}
									}
							}
					);
				add(new JScrollPane(display), BorderLayout.CENTER);
				setSize(500, 300);
				setVisible(true);
			}
		
		private void loadCrap(String userText)
			{
				try
					{
						display.setPage(userText);
					}
				catch(Exception e)
					{
						System.out.println("crap!");
					}
			}
	}