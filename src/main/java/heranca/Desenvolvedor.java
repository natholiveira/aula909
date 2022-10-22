package heranca;

import java.math.BigDecimal;

public class Desenvolvedor extends Empregado {
    private int quantidadeCafe;
    private String faculdade;

    public Desenvolvedor(String nome, int matricula, BigDecimal salario, int quantidadeCafe, String faculdade) {
        super(nome, matricula, salario);
        this.quantidadeCafe = quantidadeCafe;
        this.faculdade = faculdade;
    }

    public int getQuantidadeCafe() {
        return quantidadeCafe;
    }

    public void setQuantidadeCafe(int quantidadeCafe) {
        this.quantidadeCafe = quantidadeCafe;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public void programar() {

    }
}
