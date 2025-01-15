/*
 * Aarav Goyal
 * 1/13/2025
 * GrowthPattern.java
 * 
 * Pseudocode:
	Gets an array of numbers of height of the plant starting from 0
	Reads in the array
	Adds the height to 5
	Prints 'o' for first time the result and no change in height
	Prints '-' for the decreased value

 */
public class GrowthPattern
{

	int height[] = {-1,-3,0,0,1,2,3,4,3,4,4,6,8,6,6,7,10};
	private String symbol;
	public GrowthPattern()
	{
		symbol = new String ("");
	}

	public static void main (String [] agrs)
	{
		GrowthPattern gp = new GrowthPattern();
		gp.growIt();
	}

	public void growIt()
	{
		System.out.println("\n\n\n");
		int i = 0;
		for (i = 0; i<height.length; i++)
		{

			decideSymbols(i);
			System.out.print("t" + (i) + "\t");
			printSymbols(i);
			System.out.println("\n");
		}
		printRate();
		System.out.println("\n\n\n");
	}

	public void decideSymbols(int term)
	{
		if (term!=0) 
		{
			if (height[term]>height[term-1])
				symbol = "+";
			else if (height[term]<height[term-1])
				symbol = "-";
			else
				symbol = "o";
		}
		else
		{
			symbol = "o";
		}
	}

	public void printSymbols(int printTimes)
	{
		String pattern = new String("");
		int temp = height[printTimes];
		int x = 0;
		while (x!=temp)
		{
			pattern = pattern + symbol;
			if (temp>=0)
				x++;
			else
				x--;
		}
		if (temp<0)
			System.out.printf("%15s|", pattern);
		else if (temp>0)
			System.out.printf("%15s|%s","",pattern);
		else
			System.out.printf("%15s%s","",symbol);
	}

	public void printRate()
	{
		System.out.printf("The rate of growth for the plant is %.2f.", (height[height.length - 1] - height[0])/(double)height.length-1);
	}

}
