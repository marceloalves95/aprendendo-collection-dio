package me.rubio.alves.testes


/*
 *@created 19/02/2021 - 15:01
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/
fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)

    for (salario in salarios){

        println(salario)

    }
    println("----------------------------")
    println("Maior Salário: ${salarios.maxOrNull()}")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média Salárial: ${salarios.average()}")

    val salariosMaiorque2500 = salarios.filter { it > 2500 }
    println("----------------------------")
    salariosMaiorque2500.forEach{ println(it)}

    println("----------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("----------------------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("----------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })



}