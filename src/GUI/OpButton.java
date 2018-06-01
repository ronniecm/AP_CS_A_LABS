package GUI;

import javax.swing.*;
import java.awt.*;

public class OpButton extends JButton {
	private String op;
	private boolean pushed = false;
	
	public OpButton(String operation)
	{
		op = operation;
		setText(operation);
	}
	
	public String getOp()
	{
		return op;
	}
	
	public boolean getStatus()
	{
		return pushed;
	}
	
	public void setStatus(boolean status)
	{
		pushed = status;
		if(pushed) {
			setBackground(Color.blue);
			setForeground(Color.WHITE);
		} else {
			setBackground(null);
			setForeground(Color.black);
		}
	}
	
}

