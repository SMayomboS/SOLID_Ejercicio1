public class Matriz {

    private final int[][] elementos;

    public Matriz(int[][] elementos) {
        this.elementos = elementos;
    }

    public void imprimir() {
        for (int[] fila : elementos) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public Matriz transpuesta() {
        int filas = elementos.length;
        int columnas = elementos[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = elementos[i][j];
            }
        }

        return MatrizFactory.crearMatriz(transpuesta);
    }

    public int[][] getElementos() {
        return elementos;
    }
}