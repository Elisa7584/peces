#!/bin/bash

# Definir funciones para generar nombres, apellidos, edad, DNI y número de teléfono
obtener_nombre_aleatorio() {
    nombres=("Juan" "María" "Carlos" "Laura" "Ana" "Pedro" "Luisa" "Javier" "Elena" "Miguel")
    indice_aleatorio=$((RANDOM % ${#nombres[@]}))
    echo "${nombres[$indice_aleatorio]}"
}

obtener_apellido_aleatorio() {
    apellidos=("García" "Martínez" "López" "Fernández" "González" "Rodríguez" "Sánchez" "Pérez" "Gómez" "Díaz")
    indice_aleatorio=$((RANDOM % ${#apellidos[@]}))
    echo "${apellidos[$indice_aleatorio]}"
}

obtener_edad_aleatoria() {
    echo $((RANDOM % 83 + 18))
}

generar_dni() {
    dni=""
    for i in {1..8}; do
        dni+=$((RANDOM % 10))
    done
    dni+=${RANDOM:0:1}
    echo "$dni"
}

generar_numero_telefono() {
    primer_digito=$((RANDOM % 2 + 6))
    numero_telefono="$primer_digito"
    for i in {1..8}; do
        numero_telefono+=$((RANDOM % 10))
    done
    echo "$numero_telefono"
}

# Verificar si se proporciona el número de personas como argumento
if [ $# -ne 1 ]; then
    echo "Uso: $0 <número de personas>"
    exit 1
fi

# Generar datos aleatorios para el número de personas especificado y escribirlos en personasFake.txt
num_personas=$1
archivo="personasFake.txt"
echo "" > "$archivo"

for ((i=1; i<=$num_personas; i++)); do
    nombre=$(obtener_nombre_aleatorio)
    apellido1=$(obtener_apellido_aleatorio)
    apellido2=$(obtener_apellido_aleatorio)
    edad=$(obtener_edad_aleatoria)
    dni=$(generar_dni)
    telefono=$(generar_numero_telefono)
    echo "Persona $i: $nombre $apellido1 $apellido2 - Edad: $edad - Teléfono: $telefono - DNI: $dni" >> "$archivo"
done

# Mostrar el contenido del archivo generado
cat "$archivo"
