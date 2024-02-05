import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String ciudad;
    private int anoInauguracion;
    private int numPersonasAdscritas;
    private ArrayList<Libro> listaLibros;

    // Constructor básico
    public Biblioteca(String nombre, String ciudad, int anoInauguracion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        setAnoInauguracion(anoInauguracion);
        this.numPersonasAdscritas = 0;
        this.listaLibros = new ArrayList<>();
    }

    // Constructor completo
    public Biblioteca(String nombre, String ciudad, int anoInauguracion, int numPersonasAdscritas, ArrayList<Libro> listaLibros) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        setAnoInauguracion(anoInauguracion);
        setNumPersonasAdscritas(numPersonasAdscritas);
        this.listaLibros = new ArrayList<>(listaLibros);
    }

    // Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAnoInauguracion() {
        return anoInauguracion;
    }

    public void setAnoInauguracion(int anoInauguracion) {
        if (anoInauguracion >= 1218 && anoInauguracion <= 2024) {
            this.anoInauguracion = anoInauguracion;
        }
    }

    public int getNumPersonasAdscritas() {
        return numPersonasAdscritas;
    }

    public void setNumPersonasAdscritas(int numPersonasAdscritas) {
        if (numPersonasAdscritas >= 0) {
            this.numPersonasAdscritas = numPersonasAdscritas;
        }
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    // Método para calcular el presupuesto de la biblioteca
    public double calcularPresupuesto() {
        return 0.75 * numPersonasAdscritas;
    }

    // Método toString
    @Override
    public String toString() {
        return "La biblioteca " + nombre + " de " + ciudad + " (" + anoInauguracion + "), tiene adscritas " +
                numPersonasAdscritas + " personas y cuenta con " + listaLibros.size() + " libros.";
    }

    // Método para añadir un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }
}
