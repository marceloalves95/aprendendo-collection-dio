package objetos

/*
 *@created 19/02/2021 - 16:51
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/

data class Funcionario(

    val nome:String,
    val salario:Double,
    val tipo_contratacao:String)
{
        override fun toString(): String  =
            """
        Nome:      $nome
        Salário:   $salario
        """.trimIndent()

}