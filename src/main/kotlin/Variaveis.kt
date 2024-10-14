fun main() {

    /*variáveis são declaradas de forma similar a typescript
    a tipagem não precisa ser especificada caso a variável receba um valor na sua declaração
    ainda sobre tipagem, kotlin não tem tipos primitivos, basicamente tudo é um objeto
     */


    var nome: String = "Daniel"//ler e editar, variável normal
    var idade = 20


    //as variaveis podem ser usadas no print apenas botando um cifrão antes do nome delas
    println("Nome : $nome Idade : $idade ")

    // aqui existe val, que diferente de var não pode ser alterado o valor, seria equivalente a uma variável final no java
    val numerosv = 17 // apenas ler, variável final

    //aqui também temos const, que seria similar à val, porém deve ser atribuida a ela um valor definido,
    // não podemos usar retornos de métodos por exemplo e a variavel precisa ser definida fora de um método para poder ser const
    const val PI = 3.14 // apenas ler, variável static final

    //aqui também temos o tipo any, que recebe qualquer coisa, como podemos ver abaixo
    var teste: Any = numerosv;
    println(teste)

    teste = nome
    println(teste)

    teste = idade
    println(teste)
}