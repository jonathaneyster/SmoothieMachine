package smoothieShoppe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Smoothie.Apple;
import Smoothie.Fruit;
import Smoothie.Orange;
import Smoothie.Peach;

public class SmoothieRecipe
{
List<Fruit> ingredients = new ArrayList<>();	
//Add Fruit to ArrayList	
	public void addFruit(Fruit fruit)
	{		
		ingredients.add(fruit);
	}
//Print current recipes from csv file	
	public void printRecipes() throws FileNotFoundException
	{
		Scanner recipe = new Scanner(new File("/Users/jonathaneyster/Documents/workspace/ElevenFiftyIntro/src/SmoothieShoppe/csv/recipes.csv"));
	    recipe.useDelimiter(",");
	    while(recipe.hasNext())
	    {
	        System.out.print(recipe.next()+" ");
	    }
		recipe.close();
	}
//Prints ingredients from csv file
	public void printIngredients() throws FileNotFoundException
	{
		Scanner ingredients = new Scanner(new File("/Users/jonathaneyster/Documents/workspace/ElevenFiftyIntro/src/SmoothieShoppe/csv/ingredients.csv"));
	    ingredients.useDelimiter(",");
	    while(ingredients.hasNext())
	    {
	        System.out.print(ingredients.next()+" ");
	    }
		ingredients.close();	
	}
//Prints inventory from csv file
	public void printInventory() throws FileNotFoundException
	{
		Scanner inva = new Scanner(new File("/Users/jonathaneyster/Documents/workspace/ElevenFiftyIntro/src/SmoothieShoppe/csv/inventorya.csv"));
	    inva.useDelimiter(",");
	    while(inva.hasNext())
	    {
	        System.out.print(inva.next()+" ");
	    }
		inva.close();		
	}
//Create smoothies from recipe
	public void Smoothie1()
	{
		ingredients.add(new Apple());
		ingredients.add(new Orange());

	}
	public void Smoothie2()
	{
		ingredients.add(new Apple());
		ingredients.add(new Peach());

	}
	public void Smoothie3()
	{
		ingredients.add(new Orange());
		ingredients.add(new Peach());
	}
//Return two ingredients, name, cost, and sum 		
		public void showRecipe()
		{
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("The first ingredient of the smoothie is: " + ingredients.get(0).getInfo() + " ($" + ingredients.get(0).getCost() + ")");
			System.out.println();
			System.out.println();
			System.out.print("The second ingredient of the smoothie is: "+ ingredients.get(1).getInfo() + " ($" + ingredients.get(1).getCost() + ")");
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Total cost of your " + ingredients.get(0).getInfo() + " " + ingredients.get(1).getInfo() + " " + "smoothie is: $" + (ingredients.get(0).getCost()+ingredients.get(1).getCost()));
		}	
}
