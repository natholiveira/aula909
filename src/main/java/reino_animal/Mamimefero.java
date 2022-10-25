package reino_animal;

public class Mamimefero extends Animal {

    private int quantidadePatas;

    public Mamimefero(String cor, String nome, String ambiente, Double velocidadeMedia, int quantidadePatas) {
        super(cor, nome, ambiente, velocidadeMedia);
        this.quantidadePatas = quantidadePatas;
    }

    public void amamentar() {
        System.out.println("Animal está amamentando");
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    @Override
    public void comer() {
        System.out.println("O mamífero está comendo!");
    }

    @Override
    public String toString() {
        return super.toString() + "Mamimefero{" +
                "quantidadePatas=" + quantidadePatas +
                '}';
    }
}
