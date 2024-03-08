import java.util.ArrayList;

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
                i--;
            }
        }
    }

    public String toString() {
        return "En mi estuche hay " + boligrafos.size() + " bolígrafos.";
    }
}
