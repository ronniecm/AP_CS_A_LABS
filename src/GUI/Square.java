package GUI;

import javax.swing.*;
import java.awt.*;

public class Square extends JButton {
	private int value;
	
	public Square()
	{
		value = (int)(Math.random() * 2 + 1);
		setOpaque(true);
		setBackground(Color.YELLOW);
		setText("" + value);
	}
	
	public int getVal()
	{
		return value;
	}
	
	public void setVal(int newVal)
	{
		value = newVal;
	}
}
