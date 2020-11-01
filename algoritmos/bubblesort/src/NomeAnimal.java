/*
* Exemplo de bubblesort utilizado para ordenar array de strings
*/

public class NomeAnimal {
    public static void main(String[] args) {
        Animal bidu = new Animal("Cachorro", "Bidu");
        Animal fred = new Animal("Peixe", "Fred");
        Animal rex = new Animal("Cachorro", "Rex");
        Animal akamaru = new Animal("Cachorro", "Akamaru");
        Animal mingau = new Animal("Gato", "Mingau");

        Animal[] animais = new Animal[] {bidu, fred, rex, akamaru, mingau};

        NomeAnimal na = new NomeAnimal();
        //na.ordenarAnimaisPorNome(animais);
        na.ordenarAnimaisPorRacaENome(animais);

        for(int tamanho = 0; tamanho < animais.length; tamanho++) {
            System.out.println("Especie: " + animais[tamanho].getEspecie() +
                    " - Nome: " + animais[tamanho].getNome());
        }
    }

    /**
     * Método que ordena um vetor de Animal utilizando o algortimo Bubble Sort,
     * a ordenação é feita de acordo com o nome de cada animal.
     *
     * @param animais - Vetor de Animal.
     */
    public void ordenarAnimaisPorNome(Animal[] animais) {
    /* for utilizado para controlar a quantidade de vezes que o vetor será
	   ordenado. */
        for(int i = 0; i < animais.length - 1; i++) {
            // Variavel utilizada para controlar se o vetor ja está ordenado.
            boolean estaOrdenado = true;
            // for utilizado para ordenar o vetor.
            for(int j = 0; j < animais.length - 1 - i; j++) {
        /* Se o nome do animal na posição atual do vetor for maior que o nome
           do proximo animal, então troca os Animais de lugar no vetor. */
                if(animais[j].getNome().compareToIgnoreCase(animais[j + 1].getNome()) > 0) {
                    Animal aux = animais[j];
                    animais[j] = animais[j + 1];
                    animais[j + 1] = aux;
                    estaOrdenado = false;
                }
            }
            // Se o vetor está ordenado então para as iterações sobre ele.
            if(estaOrdenado)
                break;
        }
    }
    /**
     * Método que ordena um vetor de Animal utilizando o algortimo Bubble Sort,
     * a ordenação é feita de acordo com a especie e nome de cada animal.
     *
     * @param animais - Vetor de Animal.
     */
    public void ordenarAnimaisPorRacaENome(Animal[] animais) {
    /* for utilizado para controlar a quantidade de vezes que o vetor será
	   ordenado. */
        for(int i = 0; i < animais.length - 1; i++) {
            // Variavel utilizada para controlar se o vetor ja está ordenado.
            boolean estaOrdenado = true;
            // for utilizado para ordenar o vetor.
            for(int j = 0; j < animais.length - 1 - i; j++) {
        /* Se o nome da especie do animal na posição atual do vetor for maior
           que o nome da especie do proximo animal, então troca os animais
		   de lugar no vetor. */
                if(animais[j].getEspecie().compareToIgnoreCase(animais[j + 1].getEspecie()) > 0) {
                    Animal aux = animais[j];
                    animais[j] = animais[j + 1];
                    animais[j + 1] = aux;
                    estaOrdenado = false;
                }
        /* Se o nome do da especie do animal na posição atual do vetor for
           igual o nome da especie do proximo animal, e o nome do animal
           na posição atual do vetor for maior que o nome do proximo animel,
		   então troca os animais de lugar no vetor. */
                else if(animais[j].getEspecie().equals(animais[j + 1].getEspecie()) &&
                        animais[j].getNome().compareToIgnoreCase(animais[j + 1].getNome()) > 0) {
                    Animal aux = animais[j];
                    animais[j] = animais[j + 1];
                    animais[j + 1] = aux;
                }
            }
            // Se o vetor está ordenado então para as iterações sobre ele.
            if(estaOrdenado)
                break;
        }
    }
}
