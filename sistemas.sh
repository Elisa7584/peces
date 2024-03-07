#!/bin/bash

# Definir funciones para generar nombres, apellidos, edad, DNI y número de teléfono
<<<<<<< HEAD
get_random_nombre() {
    nombres=("Juan" "María" "Carlos" "Laura" "Ana" "Pedro" "Luisa" "Javier" "Elena" "Miguel")
    random_index=$((RANDOM % ${#nombres[@]}))
    echo "${nombres[$random_index]}"
}

get_random_apellidos() {
    apellidos=("García" "Martínez" "López" "Fernández" "González" "Rodríguez" "Sánchez" "Pérez" "Gómez" "Díaz")
    random_index=$((RANDOM % ${#apellidos[@]}))
    echo "${apellidos[$random_index]}"
}

get_random_edad() {
=======
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
>>>>>>> 948d195d694f43ba56464e9e2c40660f67c5b486
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

<<<<<<< HEAD
generar_num_tel() {
    primer_digito=$((RANDOM % 2 + 6))
    numero_tel="$primer_digito"
    for i in {1..8}; do
        numero_tel+=${RANDOM:0:1}
    done
    echo "$numero_tel"
=======
generar_numero_telefono() {
    primer_digito=$((RANDOM % 2 + 6))
    numero_telefono="$primer_digito"
    for i in {1..8}; do
        numero_telefono+=$((RANDOM % 10))
    done
    echo "$numero_telefono"
>>>>>>> 948d195d694f43ba56464e9e2c40660f67c5b486
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
<<<<<<< HEAD
    nombre=$(get_random_nombre)
    apellido1=$(get_random_apellidos)
    apellido2=$(get_random_apellidos)
    edad=$(get_random_edad)
    dni=$(generar_dni)
    telefono=$(generar_num_tel)
    echo "Persona $i: $nombre $apellido1 $apellido2 - Edad: $edad - Teléfono: $telefono - DNI: $dni" >> "$file"
=======
    nombre=$(obtener_nombre_aleatorio)
    apellido1=$(obtener_apellido_aleatorio)
    apellido2=$(obtener_apellido_aleatorio)
    edad=$(obtener_edad_aleatoria)
    dni=$(generar_dni)
    telefono=$(generar_numero_telefono)
    echo "Persona $i: $nombre $apellido1 $apellido2 - Edad: $edad - Teléfono: $telefono - DNI: $dni" >> "$archivo"
>>>>>>> 948d195d694f43ba56464e9e2c40660f67c5b486
done

# Mostrar el contenido del archivo generado
cat "$archivo"
