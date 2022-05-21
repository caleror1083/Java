import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class MyFrameClass extends JFrame
	{
		MyFrameClass()
			{
				JPanel myRedPanel;
				JPanel myBluePanel;
				JPanel myWhitePanel;
				ImageIcon myImage;
				Border myBorder;
				JLabel myLabel;
				
				myRedPanel = new JPanel();
				myBluePanel = new JPanel();
				myWhitePanel = new JPanel();
				myImage = new ImageIcon("image.jpg");
				myLabel = new JLabel();
				myBorder = BorderFactory.createLineBorder(new Color(0x000000), 5);
				
				this.setVisible(true);
				this.setIconImage(myImage.getImage());
				this.setTitle("Title Goes Here");
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setSize(640, 480);
				this.setResizable(false);
				this.getContentPane().setBackground(new Color(0x00FF00));
				this.setLayout(null);
				
				myLabel.setBorder(myBorder);
				myLabel.setOpaque(true);
				myLabel.setBackground(new Color(0x79AEEB));
				myLabel.setText("Here is text");
				myLabel.setForeground(new Color(0xFFFF00));
				myLabel.setFont(new Font("Roboto", Font.BOLD, 16));
				myLabel.setHorizontalAlignment(JLabel.CENTER);
				myLabel.setVerticalAlignment(JLabel.CENTER);
				
				myRedPanel.setBackground(new Color(0xFF0000));
				myRedPanel.setBounds(0, 0, 100, 100);
				myRedPanel.setLayout(new BorderLayout());
				myRedPanel.add(myLabel);
				
				myBluePanel.setBackground(new Color(0x0000FF));
				myBluePanel.setBounds(200, 0, 100, 100);
				
				myWhitePanel.setBackground(new Color(0xFFFFFF));
				myWhitePanel.setBounds(400, 0, 100, 100);
				
				this.add(myRedPanel);
				this.add(myBluePanel);
				this.add(myWhitePanel);
			}
	}