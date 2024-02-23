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
}
