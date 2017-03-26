import java.util.Arrays;

public class PersonInsertionSort {

    static void insertionSort(Person[] a) 
    {
    	PersonNameComparator comparator=new PersonNameComparator();
    	for(int i=1; i<a.length; ++i)
    	{
    		Person value=a[i];
    		int j;
    		for(j=i-1; j>=0; --j)
    			if(comparator.compare(a[j], value)>0)
    				a[j+1]=a[j];
    			else
    				break;
    		
    		a[j+1]=value;
    	}
    }

    public static void main(String[] args) {
    	Person[] a = { new Person("good", 23), new Person("death", 30),
    			new Person("apple", 25), new Person("internet", 15),
    			new Person("internet", 24), new Person("class", 16),
    			new Person("employee", 21), new Person("hello", 29),
    			new Person("book", 9), new Person("class", 19) };
    	
    	insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

}
