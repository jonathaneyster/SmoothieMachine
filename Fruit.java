package smoothieShoppe;

import Smoothie.Peelable;
import Smoothie.Pitable;

public class Fruit implements Peelable, Pitable
{
	private String color;
	private String name;
	private String origin;
	private double cost;
	
	public Fruit (String name, String color, String origin, double cost)
	{	
		this.name = name;
		this.color = color;
		this.origin = origin;
		this.cost = cost;
	}
	//Ignore
	public void peel()
	{
		if (this.name == "Apple")
		{
			System.out.println("You peel the " + this.name);	
		}
		if (this.name == "Orange")
		{
			System.out.println("You peel the " + this.name);	
		}
		if (this.name == "Peach")
		{
			System.out.println("You peel the " + this.name);	
		}

	}
	//Ignore
	public void pit()
	{
		if (this.name == "Apple")
		{
			System.out.println("You cannot pit the " + this.name);	
		}
		if (this.name == "Orange")
		{
			System.out.println("You cannot pit the " + this.name);	
		}
		if (this.name == "Peach")
		{
			System.out.println("You pit the " + this.name);	
		}
	}
	//returns name
	public String getInfo()
	{
		return this.name;
	}
	//returns cost as double
	public double getCost()
	{
		return this.cost;
	}

}
