package carro;

public class Veiculo {
    private String cor;
    private String placa;
    private String marca;

    private TipoVeiculo tipoVeiculo;

    public Veiculo(String cor, String placa, String marca, TipoVeiculo tipoVeiculo) {
        this.cor = cor;
        this.placa = placa;
        this.marca = marca;
        this.tipoVeiculo = tipoVeiculo;
    }

    public Veiculo() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void ligar() {
        System.out.println("Ligando veículo");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
