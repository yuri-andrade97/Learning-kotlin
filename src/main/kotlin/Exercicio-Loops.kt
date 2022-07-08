fun main() {
    //exercicio 1 imprimirNumerosNaOrdemCrescente()
    //exercicio 2 imprimirNumerosNaOrdemDecrescente()
    //exercicio 3 imprimirNumerosNaOrdemCrescenteSemOsMultiplosDe5()
    //exercicio 4 somaTotalDe1Ate500()

    //exercicio 5 imprimirUmaEscadaDeCaracter()

    while1()
}

fun imprimirNumerosNaOrdemCrescente(): Unit {
    for (number in 1..50) {
        print("$number ")
    }
}

fun imprimirNumerosNaOrdemDecrescente(): Unit {
    for (number in 50 downTo 1) {
        print("$number ")
    }
}

fun imprimirNumerosNaOrdemCrescenteSemOsMultiplosDe5(): Unit {
    for (number in 1..50) {
        if (number % 5 == 0) {
            continue
        } else {
            print("$number ")
        }
    }
}

fun somaTotalDe1Ate500(): Unit {
    var somaTotal: Int = 0
    for (number in 1..500) {
        somaTotal += number
    }

    print("A soma total de 1 até 500 é $somaTotal")
}

fun imprimirUmaEscadaDeCaracter(): Unit {
    var numero: String // string porque tudo que vem de um readline é uma string, faço o cast dps
    do {
        print("Digite um número inteiro: ")
        numero = readLine().toString()
    } while (numero == "")

    val numeroFormatado = numero!!.toInt()

    for(caracter in 1 .. numeroFormatado) {

        for(j in 1..caracter) {
            print("#")
        }
        println()
    }


}

fun while1() {
    val capCaixa = 2000
    val capBalao = 7

    var numBaloes = 0

    while((numBaloes * capBalao) + capBalao < capCaixa) {
        numBaloes++
    }

    println("Cabem $numBaloes balões na caixa d'água.")
}