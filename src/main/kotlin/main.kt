import java.text.DecimalFormat

/**
 *  Criando funções
 *      As funções são declaradas com a keyword fun.
 *      O objetivo da função é declarar um trecho
 *      de código que é reutilizável, tornando o código
 *      mais fácil de dar manutenção em caso de alterações.
 * */
fun main(args: Array<String>) {
    // define o valor inicial do salário do funcionário
    val salario: Double = 4_200.00
    println("Total do salário do funcionário Pedro é: $salario")

    // declara variável para receber o calculo do bonus salarial
    var total: Double

    // calcula o bonus salarial com a função de valor fixo
    total = calcular_bonus_salarial(salario)
    println("O total do salário do funcionário Pedro com bônus de 30% é: ${DecimalFormat("#,###.00").format(total)}")

    // calcula o bonus salarial com a função que recebe como parâmetro o percentual de bonus
    total = calcular_bonus_salarial(salario, 0.5)
    println("O total do salário do funcionário Pedro com bônus de 50% e com isenção de imposto é: ${DecimalFormat("#,###.00").format(total)}")

    // calcula o bonus salarial com a função que recebe como parâmetro o percentual de bonus
    total = calcular_bonus_salarial(salario, 0.5, false)
    println("O total do salário do funcionário Pedro com bônus de 50% sem isenção de imposto é: ${DecimalFormat("#,###.00").format(total)}")
}

/**
 * A declaração de uma função se dá utilizando a keyword fun.
 * A assinatura da função é composta de:
 *  1.  identificador da função, que é obrigatória;
 *  2.  parâmetros são opcionais;
 *  3.  tipo de valor retorndo pela função quando invocada, ou
 *      em caso de função que não retorna valor, utilizar
 *      os tipos Unit ou Void;
 * Exemplo de função de calculo de bonus salarial.
 *
 * @param: salario: Double - salário do funcionário
 */
fun calcular_bonus_salarial(salario: Double): Double {
    println("iniciando calcular_bonus_salarial")
    val total: Double = salario + (0.3 * salario)
    println("termino calcular_bonus_salarial")
    return total
}

/**
 * A declaração de uma função se dá utilizando a keyword fun.
 * A seguinte função é declarada como uma sobrecarga da função
 *  calcular_bonus_salarial, e nessa versão, recebe como
 *  parâmetro o valor do salário, e percentual de incremento.
 * A função ainda recebe um parâmetro opcional com valor default
 *  definido para true, que indica se é necessário calcular o valor
 *  do imposto e subtrair do salario.
 * Exemplo de função de calculo de bonus salarial.
 *
 * @param: salario: Double - salario inicial
 * @param: percent: Double - percentual de incremento do bonus salarial
 * @param: semimposto: Boolean - flag que indica se deve ser calculado o
 *  imposto sobre o salário do funcionário
 * @return: Double, total do salario calculado com o bonus
 */
fun calcular_bonus_salarial(salario: Double, percent: Double, semimposto: Boolean = true): Double {
    println("iniciando calcular_bonus_salarial")
    if (semimposto) {
        val total: Double = salario + (percent * salario)
        println("termino calcular_bonus_salarial")
       return total
    }

    val imposto: Double = 0.25
    val total: Double = salario + (percent * salario) - salario * imposto

    println("termino calcular_bonus_salarial")
    return total
}