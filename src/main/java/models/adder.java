package models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class adder
{
	DoubleProperty sum = new SimpleDoubleProperty();
	public adder()
	{
		sum.set(0);
	}
	public void sum(double a, double b)
	{
		sum.set(a+b);
		
	}
	public DoubleProperty getSum()
	{
		return sum;
	}
	public void setSum(DoubleProperty sum)
	{
		this.sum = sum;
	}
	
}
