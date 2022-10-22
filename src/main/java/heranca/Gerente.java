package heranca;

import java.math.BigDecimal;
import java.util.Arrays;

public class Gerente extends Empregado {
    private int quantidadeEmpregagos;
    private Empregado[] subordinados;

    public int getQuantidadeEmpregagos() {
        return quantidadeEmpregagos;
    }

    public void setQuantidadeEmpregagos(int quantidadeEmpregagos) {
        this.quantidadeEmpregagos = quantidadeEmpregagos;
    }

    public Empregado[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Empregado[] subordinados) {
        this.subordinados = subordinados;
    }

    public Gerente(String nome, int matricula, BigDecimal salario) {
        super(nome, matricula, salario);
        this.subordinados = new Empregado[10];
    }

    public void contratar(Empregado novoEmpregado) {
        this.subordinados[quantidadeEmpregagos] = novoEmpregado;
        this.quantidadeEmpregagos++;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "quantidadeEmpregagos=" + quantidadeEmpregagos +
                ", subordinados=" + Arrays.toString(subordinados) +
                '}';
    }
}
