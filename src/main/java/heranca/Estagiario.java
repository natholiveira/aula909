package heranca;

import java.math.BigDecimal;

public class Estagiario extends Empregado {

    private String teste;

    public Estagiario(String nome, int matricula, BigDecimal salario) {
        super(nome, matricula, salario);
    }

    public void pegarCafe() {

    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "teste='" + teste + '\'' +
                '}';
    }
}
