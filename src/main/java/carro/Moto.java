package carro;

public class Moto extends Veiculo {
    private String modeloGuidao;

    public Moto(String cor, String placa, String marca, String modeloGuidao) {
        super(cor, placa, marca, TipoVeiculo.MOTO);
        this.modeloGuidao = modeloGuidao;
    }

    public Moto() {
        super();
    }

    public String getModeloGuidao() {
        return modeloGuidao;
    }

    public void setModeloGuidao(String modeloGuidao) {
        this.modeloGuidao = modeloGuidao;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando moto!");
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" +
                "modeloGuidao='" + modeloGuidao + '\'' +
                '}';
    }
}
