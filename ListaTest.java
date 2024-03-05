import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class ListaTest {

    @Test
    public void testContarElementos() {
        Lista lista = new Lista();
        assertEquals(0, lista.contarElementos());
        
        lista.aniadirNumeroALista(1);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(3);
        assertEquals(3, lista.contarElementos());
    }

    @Test
    public void testValorMinimo() {
        Lista lista = new Lista();
        lista.aniadirNumeroALista(5);
        lista.aniadirNumeroALista(3);
        lista.aniadirNumeroALista(7);
        lista.aniadirNumeroALista(2);
        assertEquals(2, lista.valorMinimo());
    }

    @Test
    public void testEliminarPosicion() {
        Lista lista = new Lista();
        lista.aniadirNumeroALista(1);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(3);
        
        assertTrue(lista.eliminarPosicion(1)); // Eliminar el número en la posición 1 (2)
        assertEquals(2, lista.contarElementos());
        assertEquals(1, lista.getListaNumeros().get(0).intValue());
        assertEquals(3, lista.getListaNumeros().get(1).intValue());

        assertFalse(lista.eliminarPosicion(5)); // Intentar eliminar una posición fuera de rango
        assertEquals(2, lista.contarElementos());
    }

    @Test
    public void testAniadirNumeroALista() {
        Lista lista = new Lista();
        lista.aniadirNumeroALista(1);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(3);
        assertEquals(3, lista.contarElementos());

        ArrayList<Integer> numeros = lista.getListaNumeros();
        assertEquals(1, numeros.get(0).intValue());
        assertEquals(2, numeros.get(1).intValue());
        assertEquals(3, numeros.get(2).intValue());
    }
}
