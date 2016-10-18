package smoothieShoppe;

import java.util.Scanner;
import java.io.IOException;


public class MakeSmoothie 
{

	public static void main(String[] args) throws IOException
	{
		SmoothieRecipe myRecipe = new SmoothieRecipe();
		Scanner in = new Scanner(System.in);
		System.out.println("--Smoothie-Shoppe-------------------------------------------------------------");
		System.out.println("Available actions: [b]rowse, [o]rder smoothie, [q]uit");
		System.out.print(">");
		String s = in.next();
		System.out.println("------------------------------------------------------------------------------");
		
		if (s.equals("b"))
		{
			System.out.println("Recipes: ");
			System.out.println();
			myRecipe.printRecipes();
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Available actions: [v]iew ingredients, [q]uit");
			System.out.print(">");
			s = in.next();
			if (s.equals("q"))
			{
				System.out.println("Goodbye.");
			}
			else if (s.equals("v"))
			{	
				System.out.println();
				myRecipe.printIngredients();
				System.out.println();
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("Enter a number (1-3) to order the smoothie.");
				System.out.print(">");
				s = in.next();
				if (s.equals("1"))
				{	
					myRecipe.Smoothie1();
					myRecipe.showRecipe();
				}
				else if (s.equals("2"))
				{	
					myRecipe.Smoothie2();
					myRecipe.showRecipe();
				}
				else if (s.equals("3"))
				{	
					myRecipe.Smoothie3();
					myRecipe.showRecipe();
				}				
			}
		
		}
		else if (s.equals("o"))
		{	
			myRecipe.selectIngredients();
			myRecipe.showRecipe();
		}
		else if (s.equals("q"))
		{
			System.out.println("Goodbye.");
		}
		in.close();
	}
}

