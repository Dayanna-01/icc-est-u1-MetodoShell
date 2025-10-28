public class View {
    
    public void printArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros .length - 1) {
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
    }
}
