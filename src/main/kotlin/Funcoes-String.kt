fun main() {
   val str = "Programação Kotlin."

    println("O tamanho da string: ${str.length}")

    println("Posição 0 da string: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))

    println(str.substring(3, 11))
    println(str.replace("Kotlin", "Kotlin Android ❤"))
    println(str.lowercase())
    println(str.uppercase())

    val strComEspacos: String = "      meu nome é Yuri.             "

    println(strComEspacos.trim())

}
