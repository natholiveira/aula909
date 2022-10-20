package quintanda;

public class Fruta {
    public String nome;
    public Cor cor;
    public Integer quantidade;

    public void imprimir() {
        System.out.println(
            "Nome: "+nome+
            "\n quintanda.Cor: "+cor+
            "\n Quantidade: "+quantidade
        );
    }
}
