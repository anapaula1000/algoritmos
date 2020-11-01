public class BuscaProfundidade {
    public static void main(String args[]){
        long start = System.currentTimeMillis();
        No station1 = new No("Itaquera", null, null);
        No station2 = new No("Artur Alvin", station1, null);
        No station3 = new No("Patriarca", station1, station2);
        No station4 = new No("Guilhermina", station2, station3);
        No station5 = new No("Vila Matilde", station4, station3);
        No station6 = new No("Penha", station5, station4);

        AbstractSearch searchAlgo = new DepthFirstSearch(station6, station1);

            if(searchAlgo.execute())
                    System.out.print("Path Found!");
        long elapsed = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%.3f ms%n", (elapsed - start) / 1000d);
    }
}
