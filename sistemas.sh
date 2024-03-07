#!/bin/bash

# Definir funciones para generar nombres, apellidos, edad, DNI y número de teléfono
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
    echo $((RANDOM % 83 + 18))
}

generar_dni() {
    dni=""
    for i in {1..8}; do
        dni+=${RANDOM:0:1}
    done
    dni+=${RANDOM:0:1}
    echo "$dni"
}

generar_num_tel() {
    primer_digito=$((RANDOM % 2 + 6))
    numero_tel="$primer_digito"
    for i in {1..8}; do
        numero_tel+=${RANDOM:0:1}
    done
    echo "$numero_tel"
}

# Verificar si se proporciona el número de personas como argumento
if [ $# -ne 1 ]; then
    echo "Uso: $0 <número de personas>"
    exit 1
fi

# Generar datos aleatorios para el número de personas especificado y escribirlos en personasFake.txt
num_personas=$1
file="personasFake.txt"
echo "" > "$file"

for ((i=1; i<=$num_personas; i++)); do
    nombre=$(get_random_nombre)
    apellido1=$(get_random_apellidos)
    apellido2=$(get_random_apellidos)
    edad=$(get_random_edad)
    dni=$(generar_dni)
    telefono=$(generar_num_tel)
    echo "Persona $i: $nombre $apellido1 $apellido2 - Edad: $edad - Teléfono: $telefono - DNI: $dni" >> "$file"
done

# Mostrar el contenido del archivo generado
cat "$file"
