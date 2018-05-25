package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JPanel {
	private JPanel nPanel;
	private JPanel ePanel;
	private JPanel sPanel;
	private JButton nButton1;
	private JButton nButton2;
	private JButton nButton3;
	private JButton eButton1;
	private JButton eButton2;
	private JButton eButton3;
	private JLabel sLabel;

	
	public MainPanel()
	{
		setLayout(new BorderLayout());
		
		nPanel = new JPanel();
		nPanel.setLayout(new FlowLayout());
		add(nPanel, BorderLayout.NORTH);
		
		nButton1 = new JButton("A");
		nButton1.addActionListener(new ListenerA());
		nPanel.add(nButton1);
		nButton2 = new JButton("B");
		nButton2.addActionListener(new ListenerB());
		nPanel.add(nButton2);
		nButton3 = new JButton("C");
		nButton3.addActionListener(new ListenerC());
		nPanel.add(nButton3);
		
		ePanel = new JPanel();
		ePanel.setLayout(new GridLayout(3, 1));
		add(ePanel, BorderLayout.EAST);
		
		eButton1 = new JButton("1");
		eButton1.addActionListener(new ListenerD());
		eButton2 = new JButton("2");
		eButton2.addActionListener(new ListenerE());
		eButton3 = new JButton("3");
		eButton3.addActionListener(new ListenerF());
		
		ePanel.add(eButton1, 0);
		ePanel.add(eButton2, 1);
		ePanel.add(eButton3, 2);
		
		sPanel = new JPanel();
		sPanel.setLayout(new FlowLayout());
		add(sPanel, BorderLayout.SOUTH);
		sLabel = new JLabel("Nothing now.");
		sLabel.setFont(new Font("Arial", Font.ITALIC, 36));
		sLabel.setForeground(Color.BLUE);
		sPanel.add(sLabel);
	}
	
	private class ListenerA implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			sLabel.setText("You Pressed A");
		}
		
	}
	
	private class ListenerB implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			sLabel.setText("You Pressed B");
		}
		
	}	
	
	private class ListenerC implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			sLabel.setText("You Pressed C");
		}
		
	}	
	
	private class ListenerD implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			sLabel.setText("You Pressed 1");
		}
	}	
	
	private class ListenerE implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			sLabel.setText("You Pressed 2");
		}
	}
	
	private class ListenerF implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			sLabel.setText("You Pressed 3");
		}
	}
}
