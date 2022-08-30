package com.mouredev.weeklychallenge2022

/*
 * Reto #35
 * BATALLA POKÉMON
 * Fecha publicación enunciado: 29/08/22
 * Fecha publicación resolución: 06/09/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que calcule el daño de un ataque durante una batalla Pokémon.
 * - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
 * - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
 * - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico (buscar su efectividad)
 * - El programa recibe los siguientes parámetros:
 *  - Tipo del Pokémon atacante.
 *  - Tipo del Pokémon defensor.
 *  - Ataque: Entre 1 y 100.
 *  - Defensa: Entre 1 y 100.
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 */
""" * Enunciado: Crea un programa que calcule el daño de un ataque durante una batalla Pokémon.
 * - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
 * - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
 * - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico (buscar su efectividad)
 * - El programa recibe los siguientes parámetros:
 *  - Tipo del Pokémon atacante.
 *  - Tipo del Pokémon defensor.
 *  - Ataque: Entre 1 y 100.
 *  - Defensa: Entre 1 y 100. """
#---------------------------------------------------------------------------------------#


tipo_atacante_q = input("Inserta el tipo de pokemon atacante: agua - fuego - planta - electrico\n" )
tabla = {
    "agua" : 0,
    "fuego" : 1,
    "planta" : 2,
    "electrico" : 3
}
tipo_atacante = tabla.get(tipo_atacante_q)

#---------------------------------------------------------------------------------------#


tipo_defensor_q = input("Inserta el tipo de pokemon defensor: agua - fuego - planta - electrico\n" )

tipo_defensor = tabla.get(tipo_defensor_q)

    
#---------------------------------------------------------------------------------------#


ataque = input("Inserta el numero de ataque: numero entero entre 1 - 100\n" )
ataque = int(ataque)

    

#---------------------------------------------------------------------------------------#


defensa = input("Inserta el numero de defensa: numero entero entre 1 - 100\n" )
defensa = int(defensa)
   

#---------------------------------------------------------------------------------------#
"""agua = {"agua": 0.5, "fuego": 2, "planta": 0.5, "electrico":1}
fuego = {"agua": 0.5, "fuego": 0.5, "planta": 2, "electrico":1}
planta = {"agua": 2, "fuego": 0.5, "planta" : 0.5, "electrico":1}
electrico = {"agua": 2, "fuego": 1, "planta": 0.5, "electrico":0.5}

"""

efectividad_num = [[0.5,2,0.5,1],[0.5,0.5,2,1],[2,0.5,0.5,1],[2,1,0.5,0.5]]

efectividad = efectividad_num[tipo_atacante][tipo_defensor]

damage = 50 * (ataque/defensa) * efectividad

print(damage)
