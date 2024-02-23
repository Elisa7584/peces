import java.util.ArrayList;
import java.util.List;

public class Estanteria {
    private double pesoMaximo;
    private List<Double> pesosObjetos;

    // Constructor por defecto
    public Estanteria() {
        this.pesoMaximo = 35;
        this.pesosObjetos = new ArrayList<>();
    }

    // Constructor con parámetros
    public Estanteria(double pesoMaximo, List<Double> pesosObjetos) {
        this.pesoMaximo = pesoMaximo;
        this.pesosObjetos = pesosObjetos;
    }

    // Método para calcular el peso total
    public double pesoTotal() {
        double pesoTotal = 0;
        for (Double peso : pesosObjetos) {
            pesoTotal += peso;
        }
        return pesoTotal;
    }

    // Método para añadir un objeto si es posible
    public boolean añadirObjeto(double peso) {
        if (pesoTotal() + peso <= pesoMaximo) {
            pesosObjetos.add(peso);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Estanteria{" +
                "pesoMaximo=" + pesoMaximo +
                ", objetosSoportados=" + pesosObjetos.size() +
                '}';
    }

    public static void main(String[] args) {
        // Crear una lista de CINCO estantes
        List<Estanteria> estanterias = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            estanterias.add(new Estanteria());
        }

        // Rellenar los estantes con objetos
        double[] pesosObjetos = {10, 20, 5, 15, 30, 25};
        int estanteriaActual = 0;

        for (double peso : pesosObjetos) {
            while (estanteriaActual < estanterias.size()) {
                if (estanterias.get(estanteriaActual).añadirObjeto(peso)) {
                    System.out.println("Se ha añadido un objeto de " + peso + "kg a la estantería " + estanteriaActual);
                    break;
                } else {
                    System.out.println("El objeto de " + peso + "kg no cabe en la estantería " + estanteriaActual + ", se pasa a la siguiente.");
                    estanteriaActual++;
                }
            }
            if (estanteriaActual >= estanterias.size()) {
                System.out.println("No hay más estanterías disponibles para el objeto de " + peso + "kg");
                break;
            }
        }

        // Mostrar el estado final de las estanterías
        System.out.println("\nEstado final de las estanterías:");
        for (int i = 0; i < estanterias.size(); i++) {
            System.out.println("Estantería " + i + ": " + estanterias.get(i));
        }
    }
}
