package GUI;
import javax.swing.*;
import java.awt.*;

public class Panel01 extends JPanel {
	private JLabel labelNorth;
	
	public Panel01()
	{
		setLayout(new BorderLayout());
		labelNorth = new JLabel("Top");
		add(labelNorth, BorderLayout.EAST);
	}
}
