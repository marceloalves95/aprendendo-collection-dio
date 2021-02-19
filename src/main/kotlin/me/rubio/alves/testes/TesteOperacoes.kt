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
    println("Maior Salário: ${salarios.max()}")
    println("Menor Salário: ${salarios.min()}")
    println("Média Salárial: ${salarios.average()}")

    val salariosMaiorque2500 = salarios.filter { it > 2500 }
    println("----------------------------")
    salariosMaiorque2500.forEach{ println(it)}

}