import java.util.Arrays;

public class StringSelectionSort {
	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
    static void swap(String[] a, int i, int j) {
    	String tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
    }

    // �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
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
            int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ�
            swap(a, i, minIndex);         // �� ���� i ��ġ�� �̵��Ѵ�
        }
    }

    public static void main(String[] args) {
    	String[] a = { "good", "death", "apple", "internet", "class", "employee", "hello", "book", "fight", "joker" };

        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
