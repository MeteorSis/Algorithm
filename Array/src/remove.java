public class remove {

    static void print(int[] a) {
        for (int i : a)
            System.out.printf("%d ", i);
    }

    static void remove(int[] a, int index) {
    	int i;
    	for(i=index; i<a.length-1; ++i)
    		a[i]=a[i+1];
    	a[i]=0;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; ++i)
            a[i] = i;

        remove(a, 5);

        print(a);

    }

}
