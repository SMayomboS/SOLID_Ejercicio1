public class MatrizFactory {

    private MatrizFactory() {
        // Previene instanciación
    }

    public static Matriz crearMatriz(int[][] datos) {
        return new Matriz(datos);
    }
}