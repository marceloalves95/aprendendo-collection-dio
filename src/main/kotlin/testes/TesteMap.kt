package testes


/*
 *@created 19/02/2021 - 17:05
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/

fun main() {
    val pair:Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor:$v") }

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0)

    map2.forEach { (k, v) -> println("Chave: $k - Valor:$v") }

}