import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Estuche miEstuche = new Estuche();

    while (miEstuche.boligrafos.size() < miEstuche.numMaxBoligrafos) {
        System.out.println("Introduce el color del bolígrafo: ");
        String color = sc.nextLine();
        Boligrafo nuevoBoli = new Boligrafo(color, 0);
        miEstuche.aniadirBoligrafo(nuevoBoli);
    }

    System.out.println("Introduce un texto para gastar un bolígrafo: ");
    String texto = sc.nextLine();
    Boligrafo boliAEscribir = miEstuche.boligrafos.get(0);
    boliAEscribir.escribir(texto);

    // Modificando el número de usos de otro bolígrafo para que esté gastado
    if (miEstuche.boligrafos.size() > 1) {
        Boligrafo boliGastado = miEstuche.boligrafos.get(1);
        boliGastado.setNumUsos(Boligrafo.getNumusosmax());
    }

    miEstuche.borrarBoligrafosMuyUsados();
    System.out.println(miEstuche);
}
