package smoothieShoppe;

import java.io.File;
import java.io.FileNotFoundException;
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
	List<String> orderedSmoothies = new ArrayList<>();
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
		int orderedSmoothie1=0;
		orderedSmoothie1++;
		
		ingredients.add(new Apple());
		ingredients.add(new Orange());
		orderedSmoothies.add("Apple orange smoothie: " + orderedSmoothie1);

	}
	public void Smoothie2()
	{
		int orderedSmoothie2=0;
		orderedSmoothie2++;
		
		ingredients.add(new Apple());
		ingredients.add(new Peach());
		orderedSmoothies.add("Apple peach smoothies: " + orderedSmoothie2);

	}
	public void Smoothie3()
	{
		int orderedSmoothie3=0;
		orderedSmoothie3++;
		
		ingredients.add(new Orange());
		ingredients.add(new Peach());
		orderedSmoothies.add("Orange peach smoothies: " + orderedSmoothie3);
	}
//cart function
	public void viewCart()
	{
		for (int i=0; i<orderedSmoothies.size(); i++)
		{	
			System.out.println(orderedSmoothies.get(i));
		}
		System.out.println("");
		System.out.println("Available actions: [m]ain menu, [c]heckout, [q]uit");
	}
//main menu
	public void mainMenu()
	{
		System.out.println("--Smoothie-Shoppe-------------------------------------------------------------");
		System.out.println("Available actions: [b]rowse smoothies, [q]uit");
	}
//recipe menu
	public void recipeMenu() throws FileNotFoundException
	{
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Recipes: ");
		System.out.println();
		printRecipes();
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Available actions: [v]iew ingredients, [o]rder smoothie, [q]uit");		
	}
//ingredients menu
	public void ingredientsMenu() throws FileNotFoundException
	{
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		printIngredients();
		System.out.println();
		System.out.println();
		System.out.println("Enter a number (1-3) to order the smoothie.");		
	}
//order menu
	public void orderMenu()
	{
		System.out.println();
		System.out.println("Enter a number (1-3) to order the smoothie.");
	}
	
//smoothie1 menu
	public void smoothie1Menu() throws FileNotFoundException
	{
		Smoothie1();
		showRecipe();
		System.out.println();
		printInventory();
		System.out.println();		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Order another smoothie? (y/n)");
		System.out.println("Available actions: [c]art");		
	}
//smoothie2 menu
	public void smoothie2Menu() throws FileNotFoundException
	{
		Smoothie2();
		showRecipe();
		System.out.println();
		printInventory();
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");					
		System.out.println("Order another smoothie? (y/n)");
		System.out.println("Available actions: [c]art");
	}
//smoothie3 menu
	public void smoothie3Menu() throws FileNotFoundException
	{
		Smoothie3();
		showRecipe();
		System.out.println();
		printInventory();
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");					
		System.out.println("Order another smoothie? (y/n)");
		System.out.println("Available actions: [c]art");		
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