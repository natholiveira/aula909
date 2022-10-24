package carro;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String cor, String placa, String marca, int numeroPortas) {
        super(cor, placa , marca, TipoVeiculo.CARRO);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando carro!");
    }

    @Override
    public String toString() {
        return super.toString() + "carro.Carro[" +
                " numeroPortas=" + numeroPortas +
                ']';
    }
}
