
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

}
