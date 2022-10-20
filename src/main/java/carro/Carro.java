package carro;

public class Carro {
    private int numeroPortas;
    private String cor;
    private String placa;
    private String marca;

    public static int quantidadeRodas = 4;

    public Carro(int numeroPortas, String cor, String placa, String marca) {
        this.numeroPortas = numeroPortas;
        this.cor = cor;
        this.placa = placa;
        this.marca = marca;
    }

    public Carro() {
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "carro.Carro[" +
                " numeroPortas=" + numeroPortas +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ']';
    }
}
