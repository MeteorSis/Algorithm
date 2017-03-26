import java.util.Arrays;
import java.util.Random;

public class EvenFrontOddBack {

	static void swap(int[] a, int i, int j) 
	{
	   	int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
	
    static void evenFrontOddBackSort(int[] a) {
        int even=0, odd=a.length-1;
    	while(even<odd)
        {
        	while(a[even]%2==0)
        		++even;
        	while(a[odd]%2==1)
        		--odd;
        	if(even<odd)
        		swap(a, even++, odd--);
        }
    }

    public static void main(String[] args) {
        int[] a=new int[20];
        Random random=new Random();
        for(int i=0; i<a.length; ++i)
        	a[i]=random.nextInt(100);
        
        evenFrontOddBackSort(a);
        System.out.println(Arrays.toString(a));
    }

}
