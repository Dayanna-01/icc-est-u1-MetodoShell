public class App {
    public static void main(String[] args) {
        System.out.println("Dayanna Chacha");
        int[] numeros = new int[]{5, 0, 8, 4, 9, 6, 7, 2, 3};

        SortShell shell = new SortShell();
        View view = new View();
        System.out.println("\nOriginal:");
        view.printArray(numeros);
        System.out.println();
        shell.sort(numeros, false); // false = descendente
        System.out.println("\nOrdenado:");
        view.printArray(numeros);
    }
}
