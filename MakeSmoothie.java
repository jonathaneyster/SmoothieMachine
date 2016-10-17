package smoothieShoppe;

import java.util.Scanner;
import java.io.IOException;


public class MakeSmoothie 
{

	public static void main(String[] args) throws IOException
	{
		SmoothieRecipe myRecipe = new SmoothieRecipe();
		Scanner in = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("Available actions: [v]iew recipes, [o]rder smoothie, [q]uit");
		System.out.print(">");
		String s = in.next();
		System.out.println("--------------------------------------------");
		
		if (s.equals("v"))
		{				
			myRecipe.printRecipes();
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("Available actions: [o]rder smoothie, [q]uit");
			System.out.println("(Doesnt't work) Or enter a number (1-3) to view ingredients.");
			System.out.print(">");
			s = in.next();
			if (s.equals("o"))
			{	
				myRecipe.selectIngredients();
				myRecipe.showRecipe();
			}
			else if (s.equals("q"))
			{
				System.out.println("Goodbye.");
			}
			else if (s.equals("1"))
			{	
				
			}
			else if (s.equals("2"))
			{	
				
			}
			else if (s.equals("3"))
			{	
				
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

