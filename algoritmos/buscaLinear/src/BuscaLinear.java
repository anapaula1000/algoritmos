public class BuscaLinear {
    public static void main(String a[]) {
        long start = System.currentTimeMillis();
        Object[] arr1 = {2, 3, 9, 11, 14, 22, 43, 58};
        System.out.println("Linear Search");
        search(arr1, 58);
        long elapsed = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (elapsed - start) / 1000d);
    }

    public static void search(Object[] vetor, Object elementoProcurado) {
        for (Object i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
        int tamanhoVetor = vetor.length;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i]==elementoProcurado) {
                System.out.println("Elemento procurado: "+elementoProcurado+" encontrado na posição: "+i);
                break;
            }if(i == tamanhoVetor-1){
                System.out.println("Elemento procurado não encontrado.");
            }
        }
    }
}
