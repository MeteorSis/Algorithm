import java.util.Arrays;

public class PersonSelectionSort {
	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
    static void swap(Person[] a, int i, int j) {
    	Person tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
    }

    // 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
    static int findMin(Person[] a, int start) {
    	int minIndex=start;
    	Person min=a[start];
    	PersonNameComparator comparator=new PersonNameComparator();
		for(int i=start; i<a.length; ++i)
		{
			if(comparator.compare(a[i], min)<0)
			{
				min=a[i];
				minIndex=i;
			}
		}
		return minIndex;
    }

    // selection sort
    static void selectionSort(Person[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            int minIndex = findMin(a, i); // 배열 a의 i 위치부터 끝까지에서 가장 작은 값을 찾아서
            swap(a, i, minIndex);         // 그 값을 i 위치로 이동한다
        }
    }

    public static void main(String[] args) {
    	Person[] a = { new Person("good", 23), new Person("death", 30),
    			new Person("apple", 25), new Person("internet", 15),
    			new Person("internet", 24), new Person("class", 16),
    			new Person("employee", 21), new Person("hello", 29),
    			new Person("book", 9), new Person("class", 19) };
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
