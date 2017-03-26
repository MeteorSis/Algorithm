import java.util.Arrays;

public class StringSelectionSort {
	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
    static void swap(String[] a, int i, int j) {
    	String tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
    }

    // 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
    static int findMin(String[] a, int start) {
    	int minIndex=start;
    	String min=a[start];
		for(int i=start; i<a.length; ++i)
		{
			if(a[i].compareTo(min)<0)
			{
				min=a[i];
				minIndex=i;
			}
		}
		return minIndex;
    }

    // selection sort
    static void selectionSort(String[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서
            swap(a, i, minIndex);         // 그 값을 i 위치로 이동한다
        }
    }

    public static void main(String[] args) {
    	String[] a = { "good", "death", "apple", "internet", "class", "employee", "hello", "book", "fight", "joker" };

        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
