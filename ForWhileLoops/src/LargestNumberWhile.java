public class LargestNumberWhile 
{

	public static void main(String[] args) 
	{
		int [] array1 = {1,5,11};
		int [] array2 = {};
		int [] array3 = null;
		int [] array4 = {85,29,34,110,43};
		
		LargestNumberUsingWhileLoop(array1);
		LargestNumberUsingWhileLoop(array2);
		LargestNumberUsingWhileLoop(array3);
		LargestNumberUsingWhileLoop(array4);
	}
	
	static void LargestNumberUsingWhileLoop (int [] inputArray)
	{
		if (inputArray != null) //checks to see if inputArray has a value
		{
			if (inputArray.length > 0) //checks to make sure that inputArray has at least one variable
			{
				int largestNumber = inputArray[0];
				int i = 0;
				
				while (i < inputArray.length) //checks for the largest number and stops the loop
				{
					if (largestNumber < inputArray[i])
					{
						largestNumber = inputArray[i];
					}
					i++;
				}
				
				System.out.println("The Largest Number that I found is: " + largestNumber); //prints the largest number
			}
			else
			{
				System.out.println("You gave me a null array"); //prints an error message in case the array has no variables
			}
		}		
		else
		{
			System.out.println("You gave me a null array"); //prints an error message in case the array is null
		}
	}
	
}
