fun main() {
    conversorDeAno(2)

    println("********************************************")

    println(contadorDeCaracter("João"))

    println("********************************************")

    println(calcularOCubo(9))

    println("********************************************")

    converterMilhaParaKm(1.8f)
}

fun conversorDeAno(anos: Int) {
    val converterDeAnoParaMeses = anos * 12
    val converterDeAnoParaDias = anos * 365
    val converterDeAnoParaHora = anos * 8760
    val converterDeAnoParaMinutos = anos * 525600
    val converterDeAnoParaSegundos = anos * 365 * 24 * 60 * 60

    println("${anos} anos equivalem a:")

    println("${converterDeAnoParaMeses} meses")
    println("${converterDeAnoParaDias} dias")
    println("${converterDeAnoParaHora} horas")
    println("${converterDeAnoParaMinutos} minutos")
    println("${converterDeAnoParaSegundos} segundos")
}

fun contadorDeCaracter(str: String): Int {
    val qtdCaracter = str.length
    return qtdCaracter
}

fun calcularOCubo(n: Int): Int {
    return n * n * n
}

fun converterMilhaParaKm(milha: Float) {
    val conversor = milha * 1.609

    println("${milha} milha convertida para KM é: ${conversor} KM")
}