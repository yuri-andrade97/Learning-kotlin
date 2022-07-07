fun main() {
    ehQuadrado(6, 6)

    ehTrianguloEquilatero(3, 3, 3)
}

fun ehQuadrado(ladoA: Int, ladoB: Int): Unit {
    return if (ladoA == ladoB) {
        println("QUADRADO! ${ladoA} é igual ao ${ladoB}")
    } else {
        println("Não é um quadrado, pois o ${ladoA} é diferente do ${ladoB}")
    }
}

fun ehTrianguloEquilatero(ladoA: Int, ladoB: Int, ladoC: Int) {
    return if (ladoA == ladoB && ladoA == ladoC) {
        println("Triangulo equilatéro, pois os lados são todos iguais: $ladoA, $ladoB, $ladoC")
    } else {
        println("Não é um equilatéro, pois o lados são diferentes: ${ladoA} ${ladoB} ${ladoC}")
    }
}