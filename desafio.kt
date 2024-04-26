// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var conteudos: MutableList ) {

        val inscritos = mutableListOf
    
        fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 120)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 180)
    val conteudo3 = ConteudoEducacional("Algoritmos Avançados", 240)
    
    val formacaoJava = Formacao("Formação Java", mutableListOf(conteudo1, conteudo2, conteudo3))
    
    val usuario1 = Usuario("Alice", "alice@example.com")
    val usuario2 = Usuario("Bob", "bob@example.com")
    
    formacaoJava.matricular(usuario1)
    formacaoJava.matricular(usuario2)
}