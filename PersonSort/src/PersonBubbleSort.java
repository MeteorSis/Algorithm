import java.util.Arrays;

public class PersonBubbleSort {
	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
    static void swap(Person[] a, int i, int j) {
    	Person tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
    }
  
    static void bubbleSort(Person[] a) {
        boolean checkSwap=false;
        PersonNameComparator comparator=new PersonNameComparator();
    	for(int i=0; i<a.length; ++i)
        {
        	for(int j=0; j<a.length-i-1; ++j)
            {
        		if(comparator.compare(a[j], a[j+1])>0)
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
    	Person[] a = { new Person("good", 23), new Person("death", 30),
    			new Person("apple", 25), new Person("internet", 15),
    			new Person("internet", 24), new Person("class", 16),
    			new Person("employee", 21), new Person("hello", 29),
    			new Person("book", 9), new Person("class", 19) };
    	
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
