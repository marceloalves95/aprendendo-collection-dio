package me.rubio.alves.testes


/*
 *@created 19/02/2021 - 14:49
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println("-------------------------------------")
    salarios.forEachIndexed { index, salario ->

        salarios[index] = salario * 1.1

    }
    salarios.forEach { println(it) }
    println("-------------------------------------")
    val salario2 = doubleArrayOf(1500.0,1250.0,5000.0)
    salario2.sort()
    salario2.forEach { println(it) }

}