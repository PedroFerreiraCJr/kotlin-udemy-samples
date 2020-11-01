/**
 *  Variáveis Mutáveis e Imutáveis
 *      var e val;
 * */
fun main(args: Array<String>) {
    variavel_mutavel()
    variavel_imutavel()
}

/**
 * A variável declarada com a keyword var, define uma
 *  variável mutável. Aquela que onde a reatribuição
 *  é permitida.
 *  @return: Unit
 */
fun variavel_mutavel() : Unit {
    println("iniciando método variavel_mutavel()")
    var status: Boolean = false
    if (!status) {
        status = true
    }
    println("terminando método variavel_mutavel()")
}

/**
 * A variável declarada com a keyword val, define uma
 *  variável imutável. Essa variável só recebe uma única
 *  atribuição.
 *  @return: Unit
 */
fun variavel_imutavel() : Unit {
    println("iniciando método variavel_imutavel()")
    val status: Boolean = false
    if (!status) {
        // A linha abaixo, se descomentada, gera um erro
        // de compilação
        //status = true
    }
    println("terminando método variavel_imutavel()")
}