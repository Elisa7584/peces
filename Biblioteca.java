import java.util.ArrayList;

public class Biblioteca {
    // Atributos de instancia
    private String nombre;
    private String ciudad;
    private int añoInauguracion;
    private int numPersonasAdscritas;
    private ArrayList<Libro> listaLibros;

    // Constructor básico
    public Biblioteca(String nombre, String ciudad, int añoInauguracion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        if (añoInauguracion >= 1218 && añoInauguracion <= 2024) {
            this.añoInauguracion = añoInauguracion;
        } else {
            this.añoInauguracion = 2024;
        }
        this.numPersonasAdscritas = 0;
        this.listaLibros = new ArrayList<>();
    }

    // Constructor completo
    public Biblioteca(String nombre, String ciudad, int añoInauguracion, int numPersonasAdscritas, ArrayList<Libro> listaLibros) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        if (añoInauguracion >= 1218 && añoInauguracion <= 2024) {
            this.añoInauguracion = añoInauguracion;
        } else {
            this.añoInauguracion = 2024;
        }
        if (numPersonasAdscritas >= 0) {
            this.numPersonasAdscritas = numPersonasAdscritas;
        } else {
            this.numPersonasAdscritas = 0;
        }
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

    public int getAñoInauguracion() {
        return añoInauguracion;
    }

    public void setAñoInauguracion(int añoInauguracion) {
        if (añoInauguracion >= 1218 && añoInauguracion <= 2024) {
            this.añoInauguracion = añoInauguracion;
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
        return "La biblioteca " + nombre + " de " + ciudad + " (" + añoInauguracion + "), tiene adscritas " +
                numPersonasAdscritas + " personas y cuenta con " + listaLibros.size() + " libros.";
    }

    // Método extra para añadir un libro a la biblioteca
    public void añadirLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public static void main(String[] args) {
        // Creación de libros
        Libro libro1 = new Libro("Las Tempestálidas", "Georgi Gospodinov", 841761, 2020, 400);
        Libro libro2 = new Libro("Cómo matar a tu familia", "Bella Mackie", 849129, 2021, 400);
        Libro libro3 = new Libro("Oso", "Marian Engel", 841597, 1976, 168);

        // Creación de bibliotecas
        Biblioteca bibliotecaSalon = new Biblioteca("Salón", "Granada", 1917, 32916, new ArrayList<>(List.of(libro1, libro2)));
        Biblioteca bibliotecaNueva = new Biblioteca("Nueva", "Granada", 2023);

        // Imprimir por pantalla las bibliotecas creadas
        System.out.println(bibliotecaSalon);
        System.out.println(bibliotecaNueva);

        // Calcular y imprimir por pantalla los presupuestos de las bibliotecas
        System.out.println("Presupuesto de Salon: " + bibliotecaSalon.calcularPresupuesto());
        System.out.println("Presupuesto de Nueva: " + bibliotecaNueva.calcularPresupuesto());
    }
}
