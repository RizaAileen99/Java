public class Armstrong 
{

	public static void main(String[] args) 
	{
		int number,remainder, sum = 0;
		System.out.print("The Armstrong numbers from 1 to 1000 are:");
		for (int x = 1; x <= 1000; x++)
		{
			number = x; 
			while (number > 0)
			{
				remainder = number % 10;
				sum = sum + (remainder*remainder*remainder); 
				number = number / 10; 
			}
	 
			if (sum == x)
			{
				System.out.print(x + " ");
			}
			sum = 0;
		}

	}

}