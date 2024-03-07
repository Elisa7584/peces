#!/bin/bash

# Definir funciones para generar nombres, apellidos, edad, DNI y número de teléfono
get_random_name() {
    names=("Juan" "María" "Carlos" "Laura" "Ana" "Pedro" "Luisa" "Javier" "Elena" "Miguel")
    rand_index=$((RANDOM % ${#names[@]}))
    echo "${names[$rand_index]}"
}

get_random_last_name() {
    last_names=("García" "Martínez" "López" "Fernández" "González" "Rodríguez" "Sánchez" "Pérez" "Gómez" "Díaz")
    rand_index=$((RANDOM % ${#last_names[@]}))
    echo "${last_names[$rand_index]}"
}

get_random_age() {
    echo $((RANDOM % 83 + 18))
}

generate_dni() {
    dni=""
    for i in {1..8}; do
        dni+=${RANDOM:0:1}
    done
    dni+=${RANDOM:0:1}
    echo "$dni"
}

generate_phone_number() {
    first_digit=$((RANDOM % 2 + 6))
    phone_number="$first_digit"
    for i in {1..8}; do
        phone_number+=${RANDOM:0:1}
    done
    echo "$phone_number"
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
    nombre=$(get_random_name)
    apellido1=$(get_random_last_name)
    apellido2=$(get_random_last_name)
    edad=$(get_random_age)
    dni=$(generate_dni)
    telefono=$(generate_phone_number)
    echo "Persona $i: $nombre $apellido1 $apellido2 - Edad: $edad - Teléfono: $telefono - DNI: $dni" >> "$file"
done

# Mostrar el contenido del archivo generado
cat "$file"
