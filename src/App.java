public class App {
    public static void main(String[] args) throws Exception {
        /// 5, 0, -1, 4, 9, 6, -5, 2, 3
        int[] numeros = new int[]{5, 0, 2, 4, 9, 6, -5, 2, 3};
        SortShell shell = new SortShell();
        View view = new View();

        System.out.println("Original: ");
        view.printArray(numeros);
        shell.sort(numeros, false);
        System.out.println("\nOrdenado: ");
        view.printArray(numeros);
    }
}
