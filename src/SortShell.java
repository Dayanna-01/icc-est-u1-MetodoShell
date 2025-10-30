public class SortShell {

    public SortShell() {
        System.out.println("Método Shell");
    }

    public void sort(int[] numeros, boolean ascendente) {
        int n = numeros.length;
        int comparaciones = 0;
        int movimientos = 0;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = numeros[i];
                int j = i;

                while (j >= gap) {
                    comparaciones++; 

                    if (comparar(numeros[j - gap], temp, ascendente)) {
                        numeros[j] = numeros[j - gap];
                        j -= gap;
                        movimientos++;
                    } else {
                        break;
                    }
                }

                numeros[j] = temp;
            }
        }

        int acciones = comparaciones + movimientos;

        System.out.println();
        System.out.println("Acciones(comparaciones y cambio): " + acciones );
    }

    private boolean comparar(int a, int b, boolean ascendente) {
        if (ascendente) {
            return a > b;
        } else {
            return a < b;
        }
    }
}
