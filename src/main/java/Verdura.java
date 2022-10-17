public class Verdura {
    public String nome;
    public Cor cor;
    public Integer quantidade;

    public void imprimir() {
        System.out.println(
                "Nome: "+nome+
                        "\n Cor: "+cor+
                        "\n Quantidade: "+quantidade
        );
    }
}

