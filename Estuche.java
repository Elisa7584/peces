import java.util.ArrayList;
import java.util.Scanner;

public class Estuche {
    private int numMaxBoligrafos;
    private ArrayList<Boligrafo> boligrafos;

    public Estuche() {
        this.numMaxBoligrafos = 15;
        this.boligrafos = new ArrayList<>();
    }

    public Estuche(int numMaxBoligrafos, ArrayList<Boligrafo> boligrafos) {
        this.numMaxBoligrafos = numMaxBoligrafos;
        this.boligrafos = boligrafos;
    }

    public void aniadirBoligrafo(Boligrafo boli) {
        if (boligrafos.size() < numMaxBoligrafos) {
            boligrafos.add(boli);
        } else {
            System.out.println("El estuche está lleno, no se puede añadir más bolígrafos.");
        }
    }

    public void borrarBoligrafosMuyUsados() {
        for (int i = 0; i < boligrafos.size(); i++) {
            if (boligrafos.get(i).getNumUsos() >= Boligrafo.getNumusosmax()) {
                boligrafos.remove(i);
                i--; // Necesario para ajustar el índice después de eliminar un elemento
            }
        }
    }

    public String toString() {
        return "En mi estuche hay " + boligrafos.size() + " bolígrafos.";
    }
}
