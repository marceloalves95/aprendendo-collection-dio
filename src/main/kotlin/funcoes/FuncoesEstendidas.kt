package funcoes

import java.math.BigDecimal

/*
 *@created 19/02/2021 - 17:47
 *@project aprendendo-collection-dio
 *@author Rubio Alves
*/

fun Array<BigDecimal>.somatoria() = this.reduce{

    acc, valor -> acc + valor


}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
else this.somatoria() / this.size.toBigDecimal()

