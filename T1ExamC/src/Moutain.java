import java.util.Arrays;

public class Moutain 
{
	public static boolean isIncreasing(int[] array, int stop)
	{
		for(int i = 0; i <= stop && i < array.length - 1; i++)
		{
			if(array[i + 1] < array[i])
				return false;
		}
		return true;
	}
	public static boolean isDecreasing(int[] array, int start)
	{
		for(int i = start; i <= array.length; i++)
		{
			if(array[i] < array[i + 1])
				return false;
		}
		return true;
	}
	public static int getPeakIndex(int[] array)
	{
		for(int i = 1; i < array.length -1; i++)
		{
			if(array[i] > array[i-1] && array[i] > array[i+1])
			{
				return i;
			}
		}
		return -1;
	}
	public static boolean isMountain(int[] array)
	{
		int peak = getPeakIndex(array);
		return(peak!=-1 && isIncreasing(array, peak) == true && isDecreasing(array, peak) == true);
	}
	public static void main(String[] args) 
	{
		int[] m1 = new int[] {5 ,3, 2, 9, 0};  
		int[] m2 = new int[] {5, 6, 9 ,8, 7};
		int[] m5 = new int[]  {1, 2, 3, 4, 9};
		String[] str = new String[] {"hi", "lol", "bla"};
		
		System.out.println("Increasing?: " + isIncreasing(m2, 0));
		System.out.println("Decreasing?: " + isDecreasing(m2, 0));
		System.out.println("Peak index: " +getPeakIndex(m2));
		System.out.println("Mountain?: " + isMountain(m1));
		System.out.println("Mountain?: " + isMountain(m2));
//		System.out.println("P1A(Sum of entries): " + arraySum(m5)); //P1 a Works
//		System.out.println("P1B(Sum of a row): " + Arrays.toString(rowSums(m1))); //P1 b works
//		System.out.println("P1C(Diverse matrix): " + isDiverse(m1));
//		System.out.println("P1C(Diverse matrix): " + isDiverse(m6)); //P1 C works

	}
}
