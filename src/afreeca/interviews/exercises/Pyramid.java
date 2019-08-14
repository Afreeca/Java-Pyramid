package afreeca.interviews.exercises;

public class Pyramid {

	String type = "normal";
	int level = 5;
	int row;
	int k;

	public Pyramid(String type, int level)
	{
		this.type = type;
		this.level = level;
	}

	protected void print() 
	{
		if(type.equalsIgnoreCase("reverse"))
		{
			for (row = level ; row >= 1 ; row--) 
			{
				for (k = level; k > row; k--) 
					System.out.print(" ");


				for ( k = 1 ; k < 2*row ; k++ )
					System.out.print("*");
				System.out.println("");
			}
		}
		else
		{
			int temp = level;
			for (row = 1; row <= level; row++)  // loop through level of pyramid
			{
				for (k = 1; k < temp; k++) //how many spaces before the *
					System.out.print(" ");
				temp--;
				
				for (k = 1; k <= row*2-1; k++)  // print the number of * per row, by doubling the row we guaranteed both side *
					System.out.print("*");
				System.out.println("");
			}
		}
	}
}
