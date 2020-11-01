public class Heapsort {
    public static void main(String a[]){
        long start = System.currentTimeMillis();
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Heap Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        heapSort(arr1, arr1.length);//sorting array using heap sort

        System.out.println("After Heap Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        long elapsed = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (elapsed - start) / 1000d);
    }
    public static void heapSort(int array[], int size) {
        int i;
        int temp;
        for (i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);
        for (i=size-1; i>=0; i--)
        {
            temp = array[0];
            array[0]= array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }

    }
    static void heapify(int[] arr, int size, int i)
    {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        int temp;
        if (left < size && arr[left] > arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i)
        {
            temp = arr[i];
            arr[i]= arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }
}
