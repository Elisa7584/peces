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

    @Test
    public void testBuscarNumeroEnLista() {
        Lista lista = new Lista();
        lista.aniadirNumeroALista(1);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(3);

        assertEquals(1, lista.buscarNumeroEnLista(1));
        assertEquals(2, lista.buscarNumeroEnLista(2));
        assertEquals(-1, lista.buscarNumeroEnLista(4)); // Número no presente en la lista
    }

    @Test
    public void testContarOcurrencias() {
        Lista lista = new Lista();
        lista.aniadirNumeroALista(1);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(3);

        assertEquals(1, lista.contarOcurrencias(1));
        assertEquals(2, lista.contarOcurrencias(2));
        assertEquals(0, lista.contarOcurrencias(4)); // Número no presente en la lista
    }

    @Test
    public void testBuscarTodasLasOcurrencias() {
        Lista lista = new Lista();
        lista.aniadirNumeroALista(1);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(3);

        ArrayList<Integer> ocurrencias2 = new ArrayList<>();
        ocurrencias2.add(1);
        ocurrencias2.add(2);

        assertEquals(ocurrencias2, lista.buscarTodasLasOcurrencias(2));

        ArrayList<Integer> ocurrencias4 = new ArrayList<>();
        assertEquals(ocurrencias4, lista.buscarTodasLasOcurrencias(4)); // Número no presente en la lista
    }

    @Test
    public void testOrdenarListaMenorAMayor() {
        Lista lista = new Lista();
        lista.aniadirNumeroALista(3);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(1);

        Lista listaOrdenada = new Lista();
        listaOrdenada.aniadirNumeroALista(1);
        listaOrdenada.aniadirNumeroALista(2);
        listaOrdenada.aniadirNumeroALista(3);

        assertEquals(listaOrdenada.getListaNumeros(), lista.ordenarListaMenorAMayor().getListaNumeros());
    }

    @Test
    public void testOrdenarListaMayorAMenor() {
        Lista lista = new Lista();
        lista.aniadirNumeroALista(1);
        lista.aniadirNumeroALista(2);
        lista.aniadirNumeroALista(3);

        Lista listaOrdenada = new Lista();
        listaOrdenada.aniadirNumeroALista(3);
        listaOrdenada.aniadirNumeroALista(2);
        listaOrdenada.aniadirNumeroALista(1);

        assertEquals(listaOrdenada.getListaNumeros(), lista.ordenarListaMayorAMenor());
    }

    @Test
    public void testEsCapicua() {
        Lista listaCapicua = new Lista();
        listaCapicua.aniadirNumeroALista(1);
        listaCapicua.aniadirNumeroALista(2);
        listaCapicua.aniadirNumeroALista(3);
        listaCapicua.aniadirNumeroALista(2);
        listaCapicua.aniadirNumeroALista(1);

        Lista listaNoCapicua = new Lista();
        listaNoCapicua.aniadirNumeroALista(1);
        listaNoCapicua.aniadirNumeroALista(2);
        listaNoCapicua.aniadirNumeroALista(3);
        listaNoCapicua.aniadirNumeroALista(4);
        listaNoCapicua.aniadirNumeroALista(5);

        assertTrue(listaCapicua.esCapicua());
        assertFalse(listaNoCapicua.esCapicua());
    }
}
