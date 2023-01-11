import java.util.Arrays;

public class Algorithms 
{
	public static int binarySearch(int[] a, int target)
	{
		int left = 0;
		int right = a.length - 1;
		while(left <= right)
		{
			int mid = (left + right) / 2;
			if(a[mid] == target)
				return mid;
			else if(target > a[mid])
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	//	public static String[] merge(String[] list1, String[] list2)
	//	{
	//		String[] temp = new String[list1.length + list2.length];
	//		int oneCount = 0;
	//		int twoCount = 0;
	//		for(int i = 0; i < temp.length; i++)
	//		{
	//			int compared = list1[i].compareTo(list2[i]); //-1 if list 1 precedes list 2; 0 if same; 1 if list 2 follows list 1
	//			if(compared == -1)
	//			{
	//				temp[i] = list1[i];
	//				oneCount++;
	//			}
	//			else
	//			{
	//				temp[i] = list2[i];
	//				twoCount++;
	//			}
	//		}
	//		//Determine which still has more then copy the leftovers into temp
	//		if(oneCount != list1.length)
	//		{
	//			for(int i = oneCount; i < temp.length; i++)
	//			{
	//				temp[i] = list1[oneCount + i];
	//			}
	//		}
	//		else if(twoCount != list2.length)
	//		{
	//			for(int i = twoCount; i < temp.length; i++)
	//			{
	//				temp[i] = list2[twoCount + i];
	//			}
	//		}
	//		return temp;		
	//	}
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] temp = new String[list1.length + list2.length];
		int oneCount = 0;
		int twoCount = 0;
		for(int i = 0; i < list1.length; i++)
		{
			for(int j = 0; j < list2.length; j++)
			{
				int compared = list1[i].compareTo(list2[j]);
				if(compared == -1)
				{
					temp[i] = list1[i];
					oneCount++;
				}
				else
				{
					temp[i] = list2[j];
					twoCount++;
				}
			}	
		}
		//Determine which still has more then copy the leftovers into temp
		if(oneCount != list1.length)
		{
			for(int i = oneCount; i < temp.length; i++)
			{
				temp[i] = list1[oneCount + i];
			}
		}
		else if(twoCount != list2.length)
		{
			for(int i = twoCount; i < temp.length; i++)
			{
				temp[i] = list2[twoCount + i];
			}
		}
		return temp;		
	}
	
	
	
	public static void main(String[] args) 
	{
		int[] m1 = new int[] {5 ,3, 2, 9, 0};  
		int[] m2 = new int[] {5, 6, 9 ,8, 7};
		int[] m5 = new int[]  {1, 2, 3, 4, 9};
		String[] l1 = new String[] {"eight", "forty", "ninety", "six", "twelve", "two"};
		String[] l2 = new String[] {"eleven", "nine", "one", "seven", "three"};

		System.out.println("binarySearch: " + binarySearch(m5, 9));
		System.out.println(Arrays.toString(merge(l1, l2)));

	}
}
