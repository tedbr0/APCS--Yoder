import java.util.Arrays;

public class Part1 
{
	/**
	 * Problem #1 pt. A
	 * Loops through the 1d array from start to back adding the current element to the sum then returning the sum
	 * @param arr
	 * @return
	 */
	public static int arraySum(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	/**
	 * Problem #1 pt. B
	 * Returns a 1d array where index k is the sum of the elements of row k in arr2D
	 * @param arr2D
	 * @return
	 */
	public static int[] rowSums(int[][] arr2D)
	{
		int[] result = new int[arr2D.length];
		
		for(int r = 0; r < arr2D.length; r++)
		{
			result[r] = arraySum(arr2D[r]); //Value at r in result is set to the sum of the array(row) at arr2D[r]
		}
		return result;
	}
	
	public static boolean isDiverse(int[][] arr2D)
	{
		int[] rSums = rowSums(arr2D);
		
		for(int i = 0; i < rSums.length -1; i++)
		{
			for(int j = i + 1; j < rSums.length; j++)
			{
				if(rSums[i] == rSums[j])
					return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) 
	{
		int[][] m1 = new int[][] { {1,0,1}, {2,0,1}, {1, 0, 0}};
		int[][] m6 = new int[][] { {1,0,1}, {2,0,1}, {1, 1, 0}};
		char[][] m2 = new char[][] { {'a', 'a'}, {'a', 'a'} };  
		double[][] m3 = new double[][] { {4.0, 4.0}, {5.0, 5.0} };  
		double[][] m4= new double[][] { {5.0, 6.0}, {3.0, 6.0} };  
		int[] m5 = new int[]  {1, 2, 3, 4, 9};
		String[] str = new String[] {"hi", "lol", "bla"};
		
		System.out.println("P1A(Sum of entries): " + arraySum(m5)); //P1 a Works
		System.out.println("P1B(Sum of a row): " + Arrays.toString(rowSums(m1))); //P1 b works
		System.out.println("P1C(Diverse matrix): " + isDiverse(m1));
		System.out.println("P1C(Diverse matrix): " + isDiverse(m6)); //P1 C works

	}

}
