package GUI;

import javax.swing.*;
import java.awt.*;

public class OpButton extends JButton {
	private String op;
	
	public OpButton(String operation)
	{
		op = operation;
		setText(operation);
	}
	
	public String getOp()
	{
		return op;
	}
}
