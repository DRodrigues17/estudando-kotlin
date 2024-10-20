fun main () {

    //aqui no kotlin, coleções são imutáveis, então se queremos que uma lista, set ou map sejam mutáveis, precisamos especificar isso na sua criação

    var nomes = listOf("Daniel", "Luiz", "Diego")

    //nomes.add("ampur")

    println(nomes)

    var deuses = mutableListOf("ausar", "auset", "heru")

    deuses.add("ampur")

    println(deuses)

}