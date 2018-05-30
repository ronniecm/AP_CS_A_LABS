package GUI;

import javax.swing.*;
import java.awt.*;

public class NumberButton extends JButton {
	private int val;
	private String stringVal;
	
	public NumberButton(int value)
	{
		val = value;
		setText("" + value);
		setOpaque(true);
		setBackground(Color.orange);
	}
	
	public NumberButton(String function)
	{
		if(function.equals("decimal")) {
			stringVal = ".";
		} else {
			stringVal = "AC";
		}
	}
	
	public int getVal()
	{
		return val;
	}
	
	public String getStringVal()
	{
		return stringVal;
	}
	
	public String printVal()
	{
		return "" + val;
	}
	
	public String printStringVal()
	{
		return stringVal;
	}
}
