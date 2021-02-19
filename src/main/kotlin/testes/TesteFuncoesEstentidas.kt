package testes

import funcoes.media
import funcoes.somatoria


/*
 *@created 19/02/2021 - 17:53
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/
fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )


    println("--------------------------")
    println(salarios.somatoria())
    println("--------------------------")
    println(salarios.media())
}