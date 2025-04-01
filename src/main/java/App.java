public class App {
    public static void main(String[] args) {
        Matriz matriz = MatrizFactory.crearMatriz(new int[][]{{1, 2}, {3, 4}});
        System.out.println("Matriz original:");
        matriz.imprimir();

        Matriz transpuesta = matriz.transpuesta();
        System.out.println("Matriz transpuesta:");
        transpuesta.imprimir();
    }
}