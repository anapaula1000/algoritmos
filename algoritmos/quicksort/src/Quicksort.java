public class Quicksort {
    public static void main(String a[]){
        long start = System.currentTimeMillis();
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Heap Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        quickSort(arr1, 0, arr1.length - 1);//sorting array using quick sort

        System.out.println("After Heap Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        long elapsed = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (elapsed - start) / 1000d);
    }
    static void quickSort(int a[], int beg, int end)
    {

        int loc;
        if(beg<end)
        {
            loc = partition(a, beg, end);
            quickSort(a, beg, loc-1);
            quickSort(a, loc+1, end);
        }
    }
    public static int partition(int[] a, int beg, int end)
    {

        int left, right, temp, loc, flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while(flag != 1)
        {
            while((a[loc] <= a[right]) && (loc!=right))
                right--;
            if(loc==right)
                flag =1;
            else if(a[loc]>a[right])
            {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if(flag!=1)
            {
                while((a[loc] >= a[left]) && (loc!=left))
                    left++;
                if(loc==left)
                    flag =1;
                else if(a[loc] <a[left])
                {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }
}
