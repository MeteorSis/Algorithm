import java.util.Arrays;

public class StringBubbleSort {
	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴�
    static void swap(String[] a, int i, int j) {
    	String tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
    }
  
    static void bubbleSort(String[] a) {
        boolean checkSwap=false;
    	for(int i=0; i<a.length; ++i)
        {
        	for(int j=0; j<a.length-i-1; ++j)
            {
            	if(a[j].compareTo(a[j+1])>0)
            	{
            		swap(a, j, j+1);
            		checkSwap=true;
            	}
            }
        	if(!checkSwap)
        		break;
        }
    	
    }

    public static void main(String[] args) {
    	String[] a = { "good", "death", "apple", "internet", "class", "employee", "hello", "book", "fight", "joker" };

        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

}
