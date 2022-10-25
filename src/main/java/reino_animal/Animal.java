package reino_animal;

public class Animal {

    private String cor;

    private String nome;

    private String ambiente;

    private Double velocidadeMedia;

    public Animal(String cor, String nome, String ambiente, Double velocidadeMedia) {
        this.cor = cor;
        this.nome = nome;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public void comer() {
        System.out.println("O animal está comendo");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(Double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidadeMedia=" + velocidadeMedia +
                '}';
    }
}
