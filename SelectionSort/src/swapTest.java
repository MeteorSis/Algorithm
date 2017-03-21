import java.util.Arrays;
class swapTest {
	static void swap(int[] a, int i, int j)
	{
		int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
	public static void main(String[] args) {
		int[] a={2, 4};
		
		System.out.println(Arrays.toString(a));
		swap(a, 0, 1);
		System.out.println(Arrays.toString(a));
	}
}
