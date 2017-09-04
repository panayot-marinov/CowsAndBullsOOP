
public class Random {
	
	
	public static int[] nNumbers(int n)
	{
		int[] randomNumbers = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			int currentRandomNumber = Random.randomDigit();
			
			if(Random.checkRepeat(randomNumbers, currentRandomNumber, i))
			{
				i--;
			}
			
			else
			{
				randomNumbers[i] = currentRandomNumber;
			}
		}
		return randomNumbers;
	}
	
	private static boolean checkRepeat(int[] array, int number, int index) {
		boolean repeat = false;
		for(int j = 0; j < index; j++)
		{
			if(array[j] == number)
			{
				repeat = true;
				break;
			}
		}
		
		return repeat;
	}
	
	public static int randomDigit()
	{
		int result = (int)(Math.random() * 10);
		return result;
	}
}
