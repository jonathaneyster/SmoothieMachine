package smoothieShoppe;
import java.util.Scanner;
import java.io.IOException;
public class MakeSmoothie 
{
	public static void main(String[] args) throws IOException
	{
		SmoothieRecipe myRecipe = new SmoothieRecipe();
		Scanner in = new Scanner(System.in);
		boolean loop = false;
	
		while (loop == false)
		{	
			myRecipe.mainMenu();
			System.out.print(">");
			String s = in.next();
			if (s.equals("b"))
			{
				myRecipe.recipeMenu();
				System.out.print(">");
				s = in.next();
				if (s.equals("q"))
				{
					System.out.println("Goodbye.");
					loop = true;
				}
				else if (s.equals("v"))
				{	
					myRecipe.ingredientsMenu();
					System.out.print(">");
					s = in.next();
					if (s.equals("1"))
					{	
						myRecipe.smoothie1Menu();
						System.out.print(">");
						s = in.next();
						if (s.equals("n"))
						{
							System.out.println("Goodbye.");
							loop = true;
						}
						if (s.equals("c"))
						{
							myRecipe.viewCart();
							System.out.print(">");
							s = in.next();
							if (s.equals("m"))
							{	
								
							}
							else if (s.equals("c"))
							{
								myRecipe.showRecipe();
								loop = true;
							}
							else if (s.equals("q"))
							{
								System.out.println("Goodbye.");
								loop = true;
							}							
						}
					}
					else if (s.equals("2"))
					{	
						myRecipe.smoothie2Menu();
						System.out.print(">");
						s = in.next();
						if (s.equals("n"))
						{
							System.out.println("Goodbye.");
							loop = true;
						}
						if (s.equals("c"))
						{
							myRecipe.viewCart();
							System.out.print(">");
							s = in.next();
							if (s.equals("m"))
							{	
								
							}
							else if (s.equals("c"))
							{
								myRecipe.showRecipe();
								loop = true;
							}
							else if (s.equals("q"))
							{
								System.out.println("Goodbye.");
								loop = true;
							}							
						}
					}
					else if (s.equals("3"))
					{	
						myRecipe.smoothie3Menu();
						System.out.print(">");
						s = in.next();
						if (s.equals("n"))
						{
							System.out.println("Goodbye.");
							loop = true;
						}	
						if (s.equals("c"))
						{
							myRecipe.viewCart();
							System.out.print(">");
							s = in.next();
							if (s.equals("m"))
							{	
								
							}
							else if (s.equals("c"))
							{
								myRecipe.showRecipe();
								loop = true;
							}
							else if (s.equals("q"))
							{
								System.out.println("Goodbye.");
								loop = true;
							}							
						}
					}				
				}
				else if (s.equals("o"))
				{	
					myRecipe.orderMenu();
					System.out.print(">");
					s = in.next();
					if (s.equals("1"))
					{	
						myRecipe.smoothie1Menu();
						System.out.print(">");
						s = in.next();
						if (s.equals("n"))
						{
							System.out.println("Goodbye.");
							loop = true;
						}	
						if (s.equals("c"))
						{
							myRecipe.viewCart();
							System.out.print(">");
							s = in.next();
							if (s.equals("m"))
							{	
								
							}
							else if (s.equals("c"))
							{
								myRecipe.showRecipe();
								loop = true;
							}
							else if (s.equals("q"))
							{
								System.out.println("Goodbye.");
								loop = true;
							}							
						}
					}
					else if (s.equals("2"))
					{	
						myRecipe.smoothie2Menu();
						System.out.print(">");
						s = in.next();
						if (s.equals("n"))
						{
							System.out.println("Goodbye.");
							loop = true;
						}
						if (s.equals("c"))
						{
							myRecipe.viewCart();
							System.out.print(">");
							s = in.next();
							if (s.equals("m"))
							{	
							
							}
							else if (s.equals("c"))
							{
								myRecipe.showRecipe();
								loop = true;
							}
							else if (s.equals("q"))
							{
								System.out.println("Goodbye.");
								loop = true;
							}
						}
					}
					else if (s.equals("3"))
					{	
						myRecipe.smoothie3Menu();
						System.out.print(">");
						s = in.next();
						if (s.equals("n"))
						{
							System.out.println("Goodbye.");
							loop = true;
						}
						if (s.equals("c"))
						{
							myRecipe.viewCart();
							System.out.print(">");
							s = in.next();
							if (s.equals("m"))
							{	
								
							}
							else if (s.equals("c"))
							{
								myRecipe.showRecipe();
								loop = true;
							}
							else if (s.equals("q"))
							{
								System.out.println("Goodbye.");
								loop = true;
							}							
						}
					}					
				}
			}
			else if (s.equals("q"))
			{
				System.out.println("Goodbye.");
				loop = true;
			}
		}
		in.close();
	}
}