fun main () {
    var nome: String? = "Daniel"

    nome = null

    /* aqui variáveis podem ser nulas, basta por um "?" após o tipo, mas ao usar precisamos de um "?" depois do nome da variável,
     porém, métodos que vão alterar o valor presente na variável não são permitidos, podemos atribuir novos valores, mas não podemos trabalhar encima do que temos
    */

    println(nome?.length)
    println(nome?.toIntOrNull() ?: 0)

   // println(nome?.toUpperCase())
   // println(nome?.toLowerCase())

}