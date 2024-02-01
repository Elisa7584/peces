import java.util.Scanner;

public class EjBucl {
    public static String palabraSeparada(String palabraSeparar) {
        String palabraNueva = "";
        for (int i = 0; i < palabraSeparar.length(); i++) {

            if (i == palabraSeparar.length() - 1) {
                palabraNueva += palabraSeparar.charAt(i);
            } else {
                palabraNueva += palabraSeparar.charAt(i) + "-";
            }
        }
        ;
        return palabraNueva;
    }

    public static void main(String[] args) {
        // Solicita palabras por teclado y repitelas hasta que el usuario escriba SALIR

        Scanner sc = new Scanner(System.in);

        String palabra = "";
        char letra;
        int numero = 0, numero1 = 0, numero2 = 0, numero3 = 0, operacion = 0;

        System.out.println("Dime una palabra: ");
        palabra = sc.nextLine();

        while (!palabra.equals("salir")) {
            System.out.println("No es correcto, vuelve a decirme otra palabra: ");
            palabra = sc.nextLine();
        };

        // // Solicita palabras por teclado y repitelas separando cada una de las letras
        // // con guiones hasta que el usuario escriba SALIR.

        while (!palabra.equals("salir")) {
            System.out.println("Dime una palabra: ");
            palabra = sc.nextLine();

            if (palabra.equals("salir")) {
                System.out.println("Has salido :)");
            } else {
                String palabraSeparada = palabraSeparada(palabra);
                System.out.println(palabraSeparada);
            }
        }
        ;

        // // Solicita una palabra y que el programa la repita 10 veces.

        for (int i = 0; i < 10; i++) {
            System.out.println(palabra);
        }
        ;

        // // Solicita una palabra y un número, haciendo que el programa repita la palabra
        // // el número de veces indicado.

        System.out.println("Dime una palabra: ");
        palabra = sc.nextLine();

        System.out.println("Dime un numero: ");
        numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(palabra);
        }

        // Del 1 al 100: Escribe los números del 1 al 100.

        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1);
        }

        // // Del 100 al 1: Escribe los números del 100 al 1.

        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }

        // // Escribe los números del 1 al 100 de dos en dos.

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // // Solicita un número y escribe los números desde el 1 a ese número

        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Solicita dos números y escribe los números comprendidos entre ellos.

        System.out.println("Dime un numero: ");
        numero1 = sc.nextInt();

        System.out.println("Dime un segundo numero: ");
        numero2 = sc.nextInt();

        for(int i = numero1 ; i < numero2 ; i++){
            System.out.println(i +1);
        }

        // Solicita tres números, el primero va a indicar desde qué número vamos a contar, 
        //el segundo hasta qué número vamos a contar y el tercero de cuántos números en cuántos números vamos a ir saltando.

        System.out.println("Dime un numero: ");
        numero1 = sc.nextInt();

        System.out.println("Dime un segundo numero: ");
        numero2 = sc.nextInt();

        System.out.println("Dime un tercer numero: ");
        numero3 = sc.nextInt();

        for(int i = numero1 ; i < numero2 ; i++){
            if (i % numero3 == 0){
                System.out.println(i);
            }
        }

        // Números pares: Dado un número, escribe los números pares comprendidos entre el 1 y el 8.

        System.out.println("Dime un numero comprendido entre el 1 y el 8: ");
        numero1 = sc.nextInt();

        for (int i = 0 ; i < 8 ; i++){
            if (i % numero1 == 0){
                System.out.println(i);
            }
        }

        // // Números impares: Dado un número, escribe los números impares comprendidos entre el 1 y el 7. 

        System.out.println("Dime un numero comprendido entre el 1 y el 7: ");
        numero2 = sc.nextInt();

        for (int i = 0 ; i < 7 ; i++){
            if (i % numero2 == 0){
                System.out.println(i);
            }
        }

        // Tabla de multiplicar: Dado un número escribe su tabla de multiplicar del 1 al 10. 

        System.out.println("Dime un numero: ");
        numero = sc.nextInt();

        for(int i = 0 ; i < 10 ; i++){
            operacion = numero * i;
            System.out.println(operacion);
        }

        // Palabra de símbolos: Dado un número y un símbolo, escribir el símbolo ese número de veces.

        System.out.println("Dime un numero: ");
        numero = sc.nextInt();

        System.out.println("Dime un símbolo: ");
        letra = sc.next().charAt(0);

        for (int i = 0 ; numero > i ; i++){
            System.out.println(letra);
        }

        // Dadas una palabra y una letra, contar el número de veces que aparece la letra en la palabra

        System.out.println("Dime una palabra: ");
        palabra = sc.nextLine();

        System.out.println("Dime una letra: ");
        letra = sc.next().charAt(0);

        int contador = 0;

        for(int i = 0 ; i < palabra.length() ; i++){
            if (palabra.charAt(i) == letra){
                contador ++;
            } 
        }
        System.out.println("La letra  " + letra + " ha aparecido " + contador + " veces");
    }
}
