/*
* O Bubblesort é um algoritmos de ordenação de complexidade O(n2).
* A ideia é que a cada iteração o maior valor seja colocado na última posição
* O algoritmo finaliza quando a iteração atual não muda nenhum elemento de posição
**/

class BubbleSort {

        public static void main(String args[]) {
            long start = System.currentTimeMillis();
            //int[] v = {1, 100, 100000000, 1000, 10, 1000000, 100000};
            int[] v = {9,14,3,2,43,11,58,22};
            System.out.println("Before Bubble Sort");
            for(int i:v){
                System.out.print(i+" ");
            }
            System.out.println();

            BubbleSort bs = new BubbleSort();
            bs.order(v);
            System.out.println("After Bubble Sort");
            for(int num : v) {
                System.out.print(num + " ");
            }
            long elapsed = System.currentTimeMillis();
            System.out.println();
            System.out.printf("%.3f ms%n", (elapsed - start) / 1000d);
        }

        public void order(int[] v) {
            for(int i = 0; i < v.length - 1; i++) {
                boolean isOrder = true;
                for(int j = 0; j < v.length - 1 - i; j++) {
                    if(v[j] > v[j + 1]) {
                        int aux = v[j];
                        v[j] = v[j + 1];
                        v[j + 1] = aux;
                        isOrder = false;
                    }
                }
                if(isOrder)
                    break;
            }
        }
    }
