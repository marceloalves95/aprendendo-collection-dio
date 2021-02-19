package testes

import objetos.Funcionario


/*
 *@created 19/02/2021 - 16:27
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/
fun main() {

    val joao = Funcionario("João",2000.0 , "CLT")
    val pedro = Funcionario("Pedro",1500.0 ,"PJ")
    val maria = Funcionario("Maria",4000.0 ,"CLT")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach { println(it) }
    println("---------------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("---------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("---------------------------------")
    funcionarios
        .groupBy { it.tipo_contratacao }
        .forEach { println(it) }


}





