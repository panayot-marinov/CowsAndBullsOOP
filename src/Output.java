
public class Output {
	
	public static int Cows(int[] inputNumbers, int[] randomNumbers, int n, boolean[] ifBull)
	{
		int cowsCount = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(Number.contains(randomNumbers, inputNumbers[i]) && !ifBull[i]) 
			{
				cowsCount++;
			}
		}
		
		return cowsCount;
	}
	
	public static int Bulls(int[] inputNumbers, int[] randomNumbers, int n, boolean[] ifBull)
	{
		int bullsCount = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(inputNumbers[i] == randomNumbers[i]) 
			{
				bullsCount++;
				ifBull[i] = true;
			}
			
		}
		
		return bullsCount;
	}
	
	
	
	public static void Print(int[] inputNumbers, int[] randomNumbers, int n)
	{
		boolean[] ifBull = new boolean[n];
		int bullsCount = Output.Bulls(inputNumbers, randomNumbers, n, ifBull);
		int cowsCount = Output.Cows(inputNumbers, randomNumbers, n, ifBull);
		
		if(bullsCount > 0 && cowsCount>0)System.out.printf("%d bulls and %d cows",bullsCount, cowsCount);
		else if(bullsCount>0)System.out.printf("%d bulls",bullsCount);
		else if(cowsCount>0)System.out.printf("%d cows",cowsCount);
		System.out.println();
	}
}
