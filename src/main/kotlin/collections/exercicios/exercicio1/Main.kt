package collections.exercicios.exercicio1

fun main() {
    var loteria = Loteria_Sonhos(mapOf(
            0 to "ovo",
            1 to "água",
            2 to "escopeta",
            3 to "cavalo",
            4 to "dentista",
            5 to "fogo"))

    loteria.primeiros_cinco()

    var dicionario = DicionarioApelido()

    dicionario.dicionario()
}