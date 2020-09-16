package collections.exercicios.exercicio1

class DicionarioApelido {
    val listaApelidosJ = listOf("Juan", "Fissura", "Maromba")
    val listaApelidosM = listOf("Night Watch", "Bruce Wayne", "Tampinha")
    val listaApelidosMa = listOf("Wonder Woman", "Mary", "Marilene")
    val listaApelidosL = listOf("Lukinha", "Jorge", "George")

    val nomes = mapOf(
            "João" to listaApelidosJ,
            "Miguel" to listaApelidosM,
            "Maria" to listaApelidosMa,
            "Lucas" to listaApelidosL
    )

    fun dicionario(){
        for (nome in nomes){
            println(" ${nome.key} Apelidos = ${nome.value}")
        }
    }

}