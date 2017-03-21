
public class findMinTest2 {
	static int findMin(int[] a, int start)
	{
		int minIndex=start, min=a[start];
		for(int i=start; i<a.length-start; ++i)
		{
			if(a[i]<min)
			{
				min=a[i];
				minIndex=i;
			}
		}
		return minIndex;


    }

	public static void main(String[] args) {
        int[] a = { 14, 11, 13, 15 };

        for (int i = 0; i < a.length; ++i) {
            int minIndex = findMin(a, i);
            System.out.println(a[minIndex]);
        }
    }
}