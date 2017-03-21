import java.util.Arrays;

public class SelectionSort {
	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
    static void swap(int[] a, int i, int j) {
    	int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
    }

    // �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
    static int findMin(int[] a, int start) {
    	int minIndex=start, min=a[start];
		for(int i=start; i<a.length; ++i)
		{
			if(a[i]<min)
			{
				min=a[i];
				minIndex=i;
			}
		}
		return minIndex;
    }

    // selection sort
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ�
            swap(a, i, minIndex);         // �� ���� i ��ġ�� �̵��Ѵ�
        }
    }

    public static void main(String[] args) {
        int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 };

        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
