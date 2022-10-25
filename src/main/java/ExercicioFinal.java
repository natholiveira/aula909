public class ExercicioFinal {

    /*
    * O dono de uma locadora percebeu que alguns filmes do seu estoque não estão mais sendo alugados.
    * Para liberar espaço no estoque e comprar novos CD's e DVD's resolveu doar os que estão parados
    * apenas ocupando espaço. Crie um sistema que faça a doação dessas mídias de forma aleatória.
    *
    * Para isso você deve criar:
    *
    * Criar classe Pai chamada Midia
    *
    * Atributos:
    - codigo : String
    - preco : Double
    - nome : String
    *
    * Métodos
    - darPlay()
    - construtor(todos os argumentos)
    - get() e set()
    *
    *
    * Criar classe Filha chamada Dvd
    *
    * Atributos:
    - idioma : String
    - possuiLegenda : boolean
    - idiomaLegenda : String
    *
    * Métodos
    - sobrescrever darPlay(): exibir a mensagem "filme iniciado"
    - construtor(todos os argumentos)
    - get() e set()
    - legenda(boolean ligar, String idioma) : liga a legenda e atualiza o idioma da legenda
    - legenda(boolean ligarDesligar) : apenas atualiza a variável possuiLegenda
    *
    *
    * Criar classe Filha chamada CD
    *
    * Atributos:
    - artista : String
    - quantidadeFaixas : int
    *
    * Métodos
    - sobrescrever darPlay(): exibir a mensagem "Primeira faixa tocando"
    - construtor(todos os argumentos)
    - get() e set()
    *
    * Criar classe DoacaoMidia
    *
    * Essa classe deve conter método pegarMidiaAleatoria() que devolve uma midia já criada na biblioteca
    * aleatória
    *
    * Esse classe deve conter método assisitirFilme(Dvd dvd) e chamar os dois métodos de legenda
    *
    * Método main
    *
    * O main deve pegar uma midia aleatoria e dar o play
    *
    * */
}
