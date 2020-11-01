public class BuscaBinária {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr1 = {2, 3, 9, 11, 14, 22, 43, 58};
        int key = 43;
        System.out.println("Binary Search, key: "+key);
        binarySearchRecursive(arr1, 0, arr1.length - 1, key);
        binarySearchIterative(arr1, key);
        long elapsed = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (elapsed - start) / 1000d);
    }

        public static void binarySearchIterative(int[] a, int key) {
        int begin = 0;
        int end = a.length - 1;
        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (key == a[middle]) {
                System.out.println("Elemento procurado: "+key+" encontrado na posição: "+middle);
                break;
            } else if (key > a[middle]) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println("Elemento procurado não encontrado.");
    }

        //Tenta encontra o elemento no array especificado (recursivamente).
        //Complexidade no tempo: O(log n).
        public static void binarySearchRecursive(int[] a, int begin, int end, int key) {
            if (begin <= end) {
                //calcula o meio
                int middle = (begin + end) / 2;
                if (key == a[middle]) {
                    System.out.println("Elemento procurado: " + key + " encontrado na posição: " + middle);
                } else if (key > a[middle]) {
                    //a busca continuará no subarray à direira
                    binarySearchRecursive(a, middle + 1, end, key);
                } else {
                    //a busca continuará no subarray à esquerda
                    binarySearchRecursive(a, begin, middle - 1, key);
                }
            }
        }

}
