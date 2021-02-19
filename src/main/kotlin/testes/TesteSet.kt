package testes

import objetos.Funcionario


/*
 *@created 19/02/2021 - 16:54
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/

fun main() {

    val joao = Funcionario("João",2000.0 , "CLT")
    val pedro = Funcionario("Pedro",1500.0 ,"PJ")
    val maria = Funcionario("Maria",4000.0 ,"CLT")

    val funcionario1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)

    val result = funcionario1.union(funcionario2)
    result.forEach{ println(it)}

    println("--------------------------------")
    val funcionario3 = setOf(joao,pedro,maria)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach{ println(it)}

    println("--------------------------------")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach{ println(it)}
}