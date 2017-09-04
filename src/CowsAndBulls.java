import java.util.Scanner;
public class CowsAndBulls 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many digit number you want to guess? Enter the number here: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Okay. Let's play!");
		
		int[] randomNumbers = Random.nNumbers(n);
		//int[] randomNumbers = {6, 5, 3, 2};
		//System.out.println(Number.toString(randomNumbers));
		
		int[] inputNumbers = Number.Read(n);
		while(!Number.compare(inputNumbers, randomNumbers, n))
		{
			Output.Print(inputNumbers, randomNumbers, n);	
			inputNumbers = Number.Read(n);
		}
		
		System.out.println("You won!");
	}
	
}
