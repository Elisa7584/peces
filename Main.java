public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Las Tempestálidas", "Georgi Gospodinov", 841761, 2020, 400);
        Libro libro2 = new Libro("Cómo matar a tu familia", "Bella Mackie", 849129, 2021, 400);
        Libro libro3 = new Libro("Oso", "Marian Engel", 841597, 1976, 168);

        // Crear bibliotecas
        Biblioteca biblioteca1 = new Biblioteca("Salón", "Granada", 1917);
        biblioteca1.setNumPersonasAdscritas(32916);
        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);

        Biblioteca biblioteca2 = new Biblioteca("Nueva", "Granada", 2023);

        // Imprimir por pantalla las bibliotecas creadas
        System.out.println(biblioteca1);
        System.out.println(biblioteca2);

        // Calcular y imprimir presupuestos de las bibliotecas
        System.out.println("Presupuesto Biblioteca 1: " + biblioteca1.calcularPresupuesto());
        System.out.println("Presupuesto Biblioteca 2: " + biblioteca2.calcularPresupuesto());
    }
}
