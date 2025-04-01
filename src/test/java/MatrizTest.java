import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrizTest {

    @Test
    void testCreacionMatriz() {
        int[][] datos = {{1, 2}, {3, 4}};
        Matriz matriz = MatrizFactory.crearMatriz(datos);
        assertNotNull(matriz);
    }

    @Test
    void testTranspuesta() {
        int[][] datos = {{1, 2}, {3, 4}};
        Matriz matriz = MatrizFactory.crearMatriz(datos);
        Matriz transpuesta = matriz.transpuesta();

        int[][] esperado = {{1, 3}, {2, 4}};
        Matriz esperadoMatriz = MatrizFactory.crearMatriz(esperado);

        // Comparar contenido interno con reflexión
        assertArrayEquals(esperado, transpuesta.getElementos());
    }
}