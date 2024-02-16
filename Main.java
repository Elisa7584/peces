public class Main {
    public static void main(String[] args) {
        // Lista de preguntas
        List<Pregunta> preguntas = new ArrayList<>();

        // Añadpo con add 5 objetos de tipo pregunta, cada uno con una pregunta, una respuesta correcta y una puntuacion
        preguntas.add(new Pregunta("¿Cuál es la capital de Francia?", "París", 1));
        preguntas.add(new Pregunta("¿En qué año llegó el hombre a la luna por primera vez?", "1969", 2));
        preguntas.add(new Pregunta("¿Quién pintó la Mona Lisa?", "Leonardo da Vinci", 2));
        preguntas.add(new Pregunta("¿Cuál es el símbolo químico del agua?", "H2O", 1));
        preguntas.add(new Pregunta("¿Cuál es el planeta más grande del sistema solar?", "Júpiter", 2));

        int puntuacionFinal = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            // Seleccionar una pregunta aleatoria
            int indicePregunta = random.nextInt(preguntas.size());
            Pregunta pregunta = preguntas.get(indicePregunta);

            // Mostrar la pregunta
            System.out.println("Pregunta " + (i + 1) + ": " + pregunta);
            System.out.print("Respuesta: ");
            String respuesta = scanner.nextLine();

            // Verificar si la respuesta es correcta y actualizar la puntuación
            if (pregunta.respuestaEsCorrecta(respuesta)) {
                System.out.println("Respuesta correcta. ¡Ganaste " + pregunta.getPuntuacion() + " puntos!");
                puntuacionFinal += pregunta.getPuntuacion();
            } else {
                System.out.println("Respuesta incorrecta. La respuesta correcta es: " + pregunta.respuestaCorrecta);
            }

            // Eliminar la pregunta para no repetirla
            preguntas.remove(indicePregunta);
        }

        // Mostrar la puntuación final
        System.out.println("\nPuntuación final: " + puntuacionFinal);
    }
}
