public class SortShell {

    public SortShell(){
        System.out.println("Metodo Shell");
    }

    public void sort(int[] numeros, boolean ase){
        int n = numeros.length;
        int comp = 1;
        int cambios = 0;

        for(int gap = n / 2; gap > 0; gap /= 2){
            for(int i = gap; i < n; i++){
                int temp = numeros[i];
                int j = i;

                while(j >= gap && numeros[j - gap] > temp){
                    comp++;
                    numeros[j] = numeros[j - gap];
                    j -= gap;
                    cambios++;
                }
                if(j >= gap && numeros[j - gap] <= temp){
                    comp++;
                }
                numeros[j] = temp;
            }
        }
        cambios++; 
        int acciones = comp + cambios;
        System.out.println("\nAcciones (cambios y comparaciones): ");
        System.out.println(acciones);
    }
}