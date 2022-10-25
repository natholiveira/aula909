package reino_animal;

public class Ave extends Animal {

    private boolean voa;

    public Ave(String cor, String nome, String ambiente, Double velocidadeMedia, boolean voa) {
        super(cor, nome, ambiente, velocidadeMedia);
        this.voa = voa;
    }

    public void voar() {
        if (voa) {
            System.out.println("Animal está voando");
        } else {
            System.out.println("Animal não voa");
        }
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    @Override
    public void comer() {
        System.out.println("A ave está comendo!");
    }

    @Override
    public String toString() {
        return super.toString() + "Ave{" +
                "voa=" + voa +
                '}';
    }
}
