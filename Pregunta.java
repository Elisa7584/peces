import java.util.ArrayList;

public class Pregunta {
    private String enunciado;
    private String respuestaCorrecta;
    private int puntuacion;

    // Constructor completo
    public Pregunta(String enunciado, String respuestaCorrecta, int puntuacion) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntuacion = puntuacion;
    }

    // Método para comprobar si la respuesta es correcta
    public boolean respuestaEsCorrecta(String respuesta) {
        return respuesta.equals(respuestaCorrecta);
    }

    // Método para cambiar la respuesta correcta (solo para propósitos de prueba)
    public void cambiarRespuestaCorrecta(String respuesta) {
        this.respuestaCorrecta = respuesta;
    }

    // Método para mostrar solo el enunciado de la pregunta
    @Override
    public String toString() {
        return enunciado;
    }

    // Método para obtener la puntuación de la pregunta
    public int getPuntuacion() {
        return puntuacion;
    }
}
