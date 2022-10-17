public class Carro {
    public int numeroPortas;
    public String cor;
    public String placa;
    public String marca;

    public static int quantidadeRodas = 4;

    public Carro(int numeroPortas, String cor, String placa, String marca) {
        this.numeroPortas = numeroPortas;
        this.cor = cor;
        this.placa = placa;
        this.marca = marca;
    }

    public Carro() {
    }

    @Override
    public String toString() {
        return "Carro[" +
                " numeroPortas=" + numeroPortas +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ']';
    }
}
