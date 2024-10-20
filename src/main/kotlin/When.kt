fun main() {

    val nome = "Daniel"

    //aqui em kotlin, não temos switch case, ao invés disso temos a expressão when
    //no when, cada caso avalia o valor do parametro, então não podemos usar métodos que retornam um boolean,
    // precisa ser sempre do mesmo tipo do parametro


    when (nome) {
        "D" -> println("Estão faltando algumas letras")
        "Z" -> println("Talvez o nome esteja escrito errado")
        "Daniel" -> println(nome)
        else -> println("não conheço esse nome")
    }

    //o when pode ser usamo como valor de váriavel por sinal, mas aí a clausula else é necessária para que a váriavel não seja nula,

    val retorno = when (nome) {
        "D" -> "Estão faltando algumas letras"
        "Z" -> "Talvez o nome esteja escrito errado"
        "Daniel" -> nome
        else -> "não conheço esse nome"
    }

    println(retorno)

    //caso o when não receba um parâmetro, podemos validar expressões booleanas para fazer os prints
    //é importante dizer, que diferente do switch case do java, em kotlin se cairmos em um caso do when, não validamos os outros

    when {
        nome[0].toString() == "D" -> println("percebi que começou escrevendo meu nome com Letra maiuscula")
        nome[0].toString() == "Z" -> println("Talvez o nome esteja escrito errado")
        nome == "Daniel" -> println("você está certo, meu nome é $nome")
        else -> println("não conheço esse nome")
    }
}