public class Fibonacci {

    public static void main(String args[])
    {
        int n = 9;
        long startRecursion = System.currentTimeMillis();
        System.out.println("Recursion: "+fibRecursion(n));
        long elapsedRecursion = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (elapsedRecursion - startRecursion) / 1000d);
        System.out.println();

        long startDynamic = System.currentTimeMillis();
        System.out.println("Dynamic: "+fibDynamic(n));
        long elapsedDynamic = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (elapsedDynamic - startDynamic) / 1000d);
        System.out.println();

        long startSO = System.currentTimeMillis();
        System.out.println("Space Optimization: "+fibSpaceOptimization(n));
        long elapsedSO = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (elapsedSO - startSO) / 1000d);
        System.out.println();

        long startDC = System.currentTimeMillis();
        System.out.println("Divide and Conquer: "+fibDivideConquer(n));
        long elapsedDC = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (elapsedDC - startDC) / 1000d);
        System.out.println();
    }

    static int fibRecursion(int n)
    {
        if (n <= 1)
            return n;
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
    static int fibDynamic(int n)
    {
        int f[] = new int[n + 1];
        int i;

        f[0] = 0;

        if (n > 0) {
            f[1] = 1;

            for (i = 2; i <= n; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
        }

        return f[n];
    }
    static int fibSpaceOptimization(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    static int fibDivideConquer(int n)
    {
        int F[][] = new int[][] { { 1, 1 }, { 1, 0 } };
        if (n == 0)
            return 0;
        power(F, n - 1);

        return F[0][0];
    }

    static void multiply(int F[][], int M[][])
    {
        int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }

    static void power(int F[][], int n)
    {
        int i;
        int M[][] = new int[][] { { 1, 1 }, { 1, 0 } };
        for (i = 2; i <= n; i++)
            multiply(F, M);
    }

}
