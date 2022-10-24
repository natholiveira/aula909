import quintanda.Cor;
import quintanda.Fruta;
import quintanda.Verdura;

public class Exercicio1 {

    public static void main(String[] args) {
        // Abstraia fruta para o sistema de quitanda
        // Os seguintes atributos devem ser considerados
        //---- nome
        //---- cor
        //---- quantidade

        // Crie a fruta banana e maça

        Fruta banana = new Fruta();
        banana.nome = "banana prata";
        banana.cor = Cor.AMARELO;
        banana.quantidade = 5;

        banana.imprimir();

        Fruta maca = new Fruta();
        maca.nome = "maça verde";
        maca.cor = Cor.VERDE;
        maca.quantidade = 10;

        maca.imprimir();

        // Abstraia verdura para o sistema de quitanda
        // Os seguintes atributos devem ser considerados
        //---- nome
        //---- cor
        //---- quantidade

        // Crie a verdura alface e couve

        Verdura alface = new Verdura();
        alface.cor = Cor.VERDE;
        alface.nome = "Alface";
        alface.quantidade = 3;



        alface.imprimir();

        Verdura couve = new Verdura();
        couve.nome = "Couve";
        couve.quantidade = 15;
        couve.cor = Cor.VERDE;

        System.out.println(couve);

        couve.imprimir();

        // Criar mais um objeto que faça sentido pra aplicação

    }
}
