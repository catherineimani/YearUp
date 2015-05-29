public class LargestNumber 
{

	public static void main(String[] args) 
	{
		int [] array1 = {1,5,6};
		int [] array2 = {};
		int [] array3 = null;
		int [] array4 = {85,29,34,110,43};
		LargestNumberUsingForLoop(array1);
		LargestNumberUsingForLoop(array2);
		LargestNumberUsingForLoop(array3);
		LargestNumberUsingForLoop(array4);
	}
	
	static void LargestNumberUsingForLoop (int [] inputArray)
	{
		if (inputArray != null) //checks to see if inputArray has a value
		{
			if (inputArray.length > 0) //checks to make sure that inputArray has at least one variable
			{
				int largestNumber = inputArray[0];
				for (int i = 0; i < inputArray.length; i++) //checks for the largest number and stops the loop
				{
					if (largestNumber < inputArray[i])
					{
						largestNumber = inputArray[i];
					}
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
