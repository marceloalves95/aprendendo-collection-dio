package me.rubio.alves.testes

/*
 *@created 19/02/2021 - 14:41
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/

fun main() {

    val nomes = Array(3){ "" }
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes){

        println(nome)
    }
    println("--------------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Zazá","Pedro")
    println("--------------------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }

}
