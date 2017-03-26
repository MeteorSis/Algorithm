import java.util.Arrays;

public class PersonSelectionSort {
	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
    static void swap(Person[] a, int i, int j) {
    	Person tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
    }

    // �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
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
            int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ�
            swap(a, i, minIndex);         // �� ���� i ��ġ�� �̵��Ѵ�
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
