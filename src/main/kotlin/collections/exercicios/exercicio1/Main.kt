package collections.exercicios.exercicio1

fun main() {
    var loteria = Loteria_Sonhos(mapOf(0 to "ovo",
            1 to "ovo",
            2 to "ovo",
            3 to "ovo",
            4 to "ovo",
            5 to "ovo"))

    loteria.primeiros_cinco()

    var dicionario = DicionarioApelido()

    dicionario.dicionario()
}