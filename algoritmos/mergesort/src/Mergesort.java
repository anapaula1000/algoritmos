public class Mergesort {
    public static void main(String a[]) {
        long start = System.currentTimeMillis();
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Heap Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        sort(arr1, 0, arr1.length - 1);//sorting array using heap sort

        System.out.println("After Heap Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        long elapsed = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (elapsed - start) / 1000d);
    }

    public static void sort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(arr, beg, mid);
            sort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }
    public static void merge(int arr[], int beg, int mid, int end)
    {

        int l = mid - beg + 1;
        int r = end - mid;

        int[] leftArray = new int [l];
        int[] rightArray = new int [r];

        for (int i=0; i<l; ++i)
            leftArray[i] = arr[beg + i];

        for (int j=0; j<r; ++j)
            rightArray[j] = arr[mid + 1+ j];


        int i = 0, j = 0;
        int k = beg;
        while (i<l&&j<r)
        {
            if (leftArray[i] <= rightArray[j])
            {
                arr[k] = leftArray[i];
                i++;
            }
            else
            {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i<l)
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j<r)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
