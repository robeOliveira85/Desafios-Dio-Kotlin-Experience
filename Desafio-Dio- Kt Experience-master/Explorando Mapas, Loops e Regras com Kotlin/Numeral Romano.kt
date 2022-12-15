package desafio3

fun main() {
    //https://www.infoescola.com/matematica/numeros-romanos/
    val numeroRomano: String? = readLine() //Ler um número em romano


    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    //variável que irá armazenar o valor final de conversão
    var resultado = 0


    for (i in numeroRomano!!.indices) {
        // Recupera o valor em romano do indice atual.
        val atual = numerosRomanos.getValue(numeroRomano[i])
        // Recupera o valor em romano do próximo indice (caso exista).
        val proximo = when (i + 1) {
            // Caso o próximo indice não exista, atribui 0 à variável $proximo.
            numeroRomano.length -> 0
            // Caso contrário, atribui o valor em romano equivalente ao próximo indice.
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }
        //"Criar as condições necessárias para cálculo do $resultado")
        if(atual>proximo){
            resultado+=atual
        } else if (atual<proximo){
            resultado-=atual
        } else {
            resultado+=atual
        }
    }


    print(resultado)
}