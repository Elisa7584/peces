import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de CINCO estantes
        List<Estanteria> estanterias = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            estanterias.add(new Estanteria());
        }

        // Rellenar los estantes con objetos
        double[] pesosObjetos = {10, 20, 5, 15, 30, 25};
        int estanteriaActual = 0;
        boolean objetoAñadido;

        for (double peso : pesosObjetos) {
            objetoAñadido = false;
            while (estanteriaActual < estanterias.size() && !objetoAñadido) {
                if (estanterias.get(estanteriaActual).añadirObjeto(peso)) {
                    System.out.println("Se ha añadido un objeto de " + peso + "kg a la estantería " + estanteriaActual);
                    objetoAñadido = true;
                } else {
                    System.out.println("El objeto de " + peso + "kg no cabe en la estantería " + estanteriaActual + ", se pasa a la siguiente.");
                    estanteriaActual++;
                }
            }
        }

        // Estado final de las estanterías
        System.out.println("\nEstado final de las estanterías:");
        for (int i = 0; i < estanterias.size(); i++) {
            System.out.println("Estantería " + i + ": " + estanterias.get(i));
        }
    }
}
