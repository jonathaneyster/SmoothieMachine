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
		Scanner recipe = new Scanner(new File("/Users/jonathaneyster/Documents/workspace/ElevenFiftyIntro/recipes.csv"));
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
		Scanner ingredients = new Scanner(new File("/Users/jonathaneyster/Documents/workspace/ElevenFiftyIntro/ingredients.csv"));
	    ingredients.useDelimiter(",");
	    while(ingredients.hasNext())
	    {
	        System.out.print(ingredients.next()+" ");
	    }
		ingredients.close();	
	}
//Select two fruits for smoothie	
	public void selectIngredients()
	{
		Scanner in = new Scanner(System.in);	
		System.out.println("Choose a fruit to add to your smoothie: Apple, Orange, or Peach.");
		System.out.print(">");
		String s = in.next();
		int apple=0;
		int orange=0;
		int peach=0;
		int numOfIngredients=0;
		
		while(numOfIngredients<=1)
		{	//Apple
			if(s.equals("Apple") && apple==0 && numOfIngredients==0 || s.equals("apple") && apple==0 && numOfIngredients==0)
			{
				numOfIngredients+= numOfIngredients+1;
				System.out.println("You added an apple to the smoothie.");
				ingredients.add(new Apple());
				apple=1;
				System.out.println("");
				System.out.println("Choose a fruit to add to your smoothie: Orange, or Peach.");
				System.out.print(">");
				s = in.next();		
			}
			else if(s.equals("Apple") && apple==0 && numOfIngredients==1 || s.equals("apple") && apple==0 && numOfIngredients==1)
			{
				numOfIngredients+= numOfIngredients+1;
				System.out.println("You added an apple to the smoothie.");
				ingredients.add(new Apple());
				apple=1;
				System.out.println("");	
			}
			else if(s.equals("Apple") && apple==1 || s.equals("apple") && apple==1)
			{	
				System.out.println("");				
				System.out.println("You've already used an apple in this smoothie. Choose another fruit to add: Orange or Peach");	
				System.out.println("");
				System.out.print(">");
				s = in.next();		
			}
			
			//Orange
			else if(s.equals("Orange") && orange==0 && numOfIngredients==0 || s.equals("orange") && orange==0 && numOfIngredients==0)
			{
				numOfIngredients+= numOfIngredients+1;
				System.out.println("You added an orange to the smoothie.");
				ingredients.add(new Orange());
				System.out.println("");
				orange=1;
				System.out.println("Choose another fruit to add to the smoothie: Apple or Peach");	
				System.out.print(">");
				s = in.next();				
			}			
			else if(s.equals("Orange") && orange==0 && numOfIngredients==1 || s.equals("orange") && orange==0 && numOfIngredients==1)
			{
				numOfIngredients+= numOfIngredients+1;
				System.out.println("You added an orange to the smoothie.");
				ingredients.add(new Orange());
				orange=1;			
				System.out.println("");
			}
			else if (s.equals("Orange") && orange==1 || s.equals("orange") && orange==1)
			{
				System.out.println("");				
				System.out.println("You've already used an orange in your smoothie. Choose another fruit to add: Apple or Peach");	
				System.out.println("");
				System.out.print(">");
				s = in.next();			
			}
			//Peach
			else if(s.equals("Peach") && peach==0 && numOfIngredients==0 || s.equals("peach") && peach==0 && numOfIngredients==0)
			{
				numOfIngredients+= numOfIngredients+1;
				System.out.println("You added a peach to the smoothie.");
				ingredients.add(new Peach());
				peach=1;
				System.out.println("");
				System.out.println("Choose another fruit to add to the smoothie: Apple or Orange");	
				System.out.print(">");
				s = in.next();				
			}	
			else if(s.equals("Peach") && peach==0 && numOfIngredients==1 || s.equals("peach") && peach==0 && numOfIngredients==1)
			{
				numOfIngredients+= numOfIngredients+1;
				System.out.println("You added a peach to the smoothie.");
				ingredients.add(new Peach());
				peach=1;
				System.out.println("");				
			}				
			else if (s.equals("Peach") && peach==1 || s.equals("peach") && peach==1)
			{
				System.out.println("");
				System.out.println("You've already used a peach in your smoothie. Choose another fruit to add: Apple or Orange");			
				System.out.println("");
				System.out.print(">");
				s = in.next();
			}
			//Anything else
			else if (s != "Apple" || s!="apple" || s != "Peach" || s!="peach" || s != "Orange" || s!="orange")
			{
				System.out.println("");
				System.out.println("Invalid. Please try again.");
				System.out.println("Choose a fruit to add to your smoothie: Apple, Orange, or Peach.");
				System.out.print(">");
				s = in.next();
			}
		}
		in.close();	
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
