fun main() {

    //variaveis diferentes mas com valores iguais ocupam o mesmo lugar na memória
    val nome1 = "daniel"
    val nome2 = "Daniel"
    val nome3 = nome1
    //quando usamos o String pool para criar uma variável, apesar do valor ser o mesmo ele aloca outro lugar na memória
    val nome4 = String("daniel".toCharArray())

    //os dois sinais de = estão comparando valor
    // o .equals compara o valor
    println(nome1.equals(nome4))
    println(nome1 == nome2)
    // os 3 sinais de = estão comparando a alocação de memória,
    //como o 2 tem um valor diferente, dá false
    // como o 4 é criado de forma diferente, dá false
    println(nome1 === nome3)
    println(nome1 === nome2)
    println(nome1 === nome4)


}