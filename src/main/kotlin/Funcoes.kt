fun main() {
    helloWorld()

    val soma = sum(10, 20)
    println(soma)

    println(divisao(10f, 3.5f))
}

fun helloWorld() {
    println("Hello World!")
}

fun sum (a: Int, b: Int): Int {
    return a + b
}

fun divisao(a: Float, b: Float) = a / b // retorno implicito