/**
 *  Criando funções de linha única
 *      O operador de atribuição é sobrecarregado para essa operação.
 * */
fun main(args: Array<String>) {
    val a: Double = 10.0
    val b: Double = 20.0

    println("calculando a soma de a ($a) mais b ($b), resultado: ${soma(a, b)}")
    println("calculando a subtração de a ($a) menos b ($b), resultado: ${subtracao(a, b)}")
    println("calculando a multiplicação de a ($a) por b ($b), resultado: ${multiplicacao(a, b)}")
    println("calculando a divisão de a ($a) por b ($b), resultado: ${divisao(a, b)}")

    println("O valor de a ($a) é par ? ${sim_nao(isPair(a.toLong()))}")
    println("As letras iniciais do seu nome são: ${abbr("Pedro", "Junior")}")
}

/**
 * A declaração de função de linha única se dá como
 *  a função a seguir, que utiliza o operador igual (=).
 * A seguinte função calcula a soma de dois números.
 * @param: a: Double - primeiro operando da soma
 * @param: b: Double - segundo operando da soma
 * @return: Double - retorna a+b
 */
fun soma(a: Double, b: Double) : Double = a + b

/**
 * A declaração de função de linha única se dá como
 *  a função a seguir, que utiliza o operador de atribuição (=).
 * A seguinte função calcula a substração de dois números.
 * @param: a: Double - primeiro operando da subtração
 * @param: b: Double - segundo operando da subtração
 * @return: Double - retorna a-b
 */
fun subtracao(a: Double, b: Double) : Double = a - b

/**
 * A declaração de função de linha única se dá como
 *  a função a seguir, que utiliza o operador de atribuição (=).
 * A seguinte função calcula a multiplicação de dois números.
 * @param: a: Double - primeiro operando da multiplicação
 * @param: b: Double - segundo operando da multiplicação
 * @return: Double - retorna a*b
 */
fun multiplicacao(a: Double, b: Double) : Double = a * b

/**
 * A declaração de função de linha única se dá como
 *  a função a seguir, que utiliza o operador de atribuição (=).
 * A seguinte função calcula a divisão de dois números.
 * @param: a: Double - primeiro operando da divisão
 * @param: b: Double - segundo operando da divisão
 * @return: Double - retorna a/b
 */
fun divisao(a: Double, b: Double) : Double = a / b

/**
 * A declaração de função de linha única se dá como
 *  a função a seguir, que utiliza o operador de atribuição (=).
 * A seguinte função verifica se um número é par.
 * @param: value: Long - valor a verificar se é par
 * @return: Boolean - retornar verdadeiro se o valor é par
 */
fun isPair(value: Long) : Boolean = (value % 2) == 0L

/**
 * A declaração de função de linha única se dá como
 *  a função a seguir, que utiliza o operador de atribuição (=).
 * A seguinte função retorna as letras iniciais do nome próprio.
 * @param: nome: String - nome
 * @param: lastname: String - sobrenome
 * @return: String - iniciais do nome e sobrenome
 */
fun abbr(name: String, lastname: String) : String = "${name[0].toUpperCase()}${lastname[0].toUpperCase()}"

fun sim_nao(value: Boolean) : String = if (value) "Sim" else "Não"