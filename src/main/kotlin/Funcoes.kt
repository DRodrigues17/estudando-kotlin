fun main() {
    comprimentar()
    comprimentoParametrizado(idade = 20)
    //aqui podemos também mudar a ordem em que passamos os parametros
    comprimentoParametrizado(idade = 20, parametro = "daniel")

    comprimentoParametrizadoComOutroMetodoComoParametro { comprimentar() }
    comprimentoParametrizadoComOutroMetodoComoParametro(outraFuncao = { println("testando") })

    val (v1, v2) = retornar2valores()
    println("idade ${retornar2valores().first} altura ${retornar2valores().second}")
    println("idade $v1 altura $v2")

    val (v3, v4, v5) = retornar3valores()
    println("idade ${retornar3valores().first} altura ${retornar3valores().second}, número da sorte ${retornar3valores().third}")
    println("idade $v3 altura $v4, número da sorte $v5")
}

//aqui não precisamos especificar que as funções são publicas, pois isso já vem por padrão,
// funções de outras classes podem ser usadas nessa com tranquilidade, sem precisar de import
//os métodos privados, tal como em java não podemos usar em arquivos diferentes
// aqui o tipo padrão de retorno é Unit, que seria equivalente ao void do java

//aqui emojis são permitidos 😯
fun comprimentar() {
    println("boa tarde 🔥")
}

//aqui podemos definir valores padrão para os parametros, fazendo com que passar eles não seja necessário
fun comprimentoParametrizado(parametro: String = "D", idade: Int) {
    println("boa tarde 🔥 $parametro, idade $idade")
}

//aqui podemos passar uma função como parametro

fun comprimentoParametrizadoComOutroMetodoComoParametro(outraFuncao: () -> Unit) {
    println("executando função")
    outraFuncao()
}

// aqui podemos fazer métodos que retornam 2 e 3 valores

fun retornar2valores(): Pair<Double, Double> {
    return 20.00 to 1.78
}

fun retornar3valores(): Triple<Double, Double, Int> {
    return Triple(20.00, 1.78, 17)
}