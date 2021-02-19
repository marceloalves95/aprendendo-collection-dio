package me.rubio.alves.testes


/*
 *@created 19/02/2021 - 14:03
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/

fun main() {
    val values = intArrayOf(2,3,1,10,7)

    values.forEach {
        println(it)
    }

    println("----------------------------")
    values.sort()
    values.forEach {
        println(it)
    }

}