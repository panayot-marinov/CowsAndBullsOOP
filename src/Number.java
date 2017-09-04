import java.util.Scanner;

public class Number {
	
	public static int[] toArray(int inputNumber, int n)
	{
		int[] inputNumbers = new int[n];
		
		for(int i = 3; i >=0; i--)
		{
			int currentDigit = inputNumber % 10;
			inputNumbers[i] = currentDigit;
			inputNumber /= 10;
		}
		
		return inputNumbers;
	}
	
	
	
	public static int[] Read(int n)
	{
		Scanner scan = new Scanner(System.in);
		int inputNumber = Integer.parseInt(scan.nextLine());
		int[] inputNumbers = Number.toArray(inputNumber, n);
		return inputNumbers;
	}
	
	public static boolean compare (int[] Array1, int[] Array2, int n)
	{
		for(int i = 1; i < n; i++)
		{
			if(Array1[i] != Array2[i]) return false;
		}
		
		return true;
	}
	
	public static String toString(int[] numbers)
	{
		String result = "";
		for(int i = 0; i < numbers.length; i++)
		{
			result += numbers[i];
		}
			
			return result;
	}
	
	public static boolean contains(int[] array, int key) {
	    for(int i = 0; i < array.length;i++)
	    {
	    	if(array[i] == key) return true;
	    }
	    return false;
	}
	
}

