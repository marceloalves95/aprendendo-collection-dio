package testes

import objetos.Funcionario


/*
 *@created 19/02/2021 - 17:18
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/

fun main() {
    val joao = Funcionario("João",2000.0 , "CLT")
    val pedro = Funcionario("Pedro",1500.0 ,"PJ")
    val maria = Funcionario("Maria",4000.0 ,"CLT")

    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach { println(it) }

    println("---------------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }



}