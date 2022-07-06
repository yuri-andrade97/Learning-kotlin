fun main() {
    helloWorld()
    val soma = sum(10, 20)
    println(soma)
}

fun helloWorld() {
    println("Hello World!")
}

fun sum (a: Int, b: Int): Int {
    return a + b
}