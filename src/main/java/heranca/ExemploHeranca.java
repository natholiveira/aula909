package heranca;

import java.math.BigDecimal;

public class ExemploHeranca {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Angela", 123, BigDecimal.TEN);

        Empregado empregado = new Empregado("", 1, BigDecimal.ONE);

        Estagiario estagiario = new Estagiario("ana", 12, BigDecimal.ONE);
        estagiario.pegarCafe();

        gerente.contratar(estagiario);
        System.out.println(gerente);
    }
}
