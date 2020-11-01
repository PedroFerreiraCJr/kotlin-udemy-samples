/**
 *  Formatação de Strings
 *
 * */
fun main(args: Array<String>) {
    var resultado: String = concatenacao_strings()
    println(resultado)
    resultado = interpolacao_strings()
    println(resultado)
    resultado = interpolacao_strings_2()
    println(resultado)
    resultado = interpolacao_strings_multiplas_linhas()
    println(resultado)
}

/**
 * O operador + quando utilizado com strings gera
 *  uma string resultando da junção dos elementos fornecidos.
 *  @return: String
 */
fun concatenacao_strings(): String {
    val firstName: String = "Pedro"
    val lastName: String = "Ferreira"

    return firstName + " " + lastName
}

/**
 * A interpolação de variáveis é possivel utilizando
 *  o operador cifrão ($) dentro de uma string, juntamente
 *  com uma variável em escopo visível, que é
 *  interpolada dentro da string resultante.
 *  @return: String
 */
fun interpolacao_strings(): String {
    val firstName: String = "Pedro"
    val lastName: String = "Ferreira"

    return "$firstName $lastName"
}

/**
 * Outra possibilidade de interpolação de variáveis em
 *  uma template string é através do operador cifrão ($)
 *  mais a utilização de chaves (${})
 *  @return: String
 */
fun interpolacao_strings_2(): String {
    val firstName: String = "Pedro"
    val lastName: String = "Ferreira"

    return "$firstName $lastName - ${firstName[0]}${lastName[0]}"
}

/**
 * O kotlin possui uma facilidade para representação
 *  de variáveis string de tamanho grande. Que é o
 *  operador três aspas duplas (""") para iniciar a declaração
 *  da string e três aspas duplas (""") para terminar
 *  a declaração da string de multiplas linhas.
 *  @return: String
 */
fun interpolacao_strings_multiplas_linhas(): String {
    val firstName: String = "Pedro"
    val lastName: String = "Ferreira"
    return """
        $firstName $lastName - ${firstName[0]}${lastName[0]}
        A linguagem de programação Kotlin é realmente muito interessante.
        Obrigado por sua colaboração!
    """.trimIndent()
}