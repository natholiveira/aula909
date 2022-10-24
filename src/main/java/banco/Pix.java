package banco;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pix extends Transferencia {

    private boolean devolucao;

    private BigDecimal valorLimiteNoturno;

    public Pix(
            BigDecimal valor,
            Conta contaOrigem,
            Conta contaDestino,
            boolean devolucao
    ) {
        super(valor, contaOrigem, contaDestino, LocalDate.now(), TipoTransferencia.PIX);
        this.devolucao = devolucao;
        this.valorLimiteNoturno = BigDecimal.valueOf(1000.0);
    }

    public boolean isDevolucao() {
        return devolucao;
    }

    public void setDevolucao(boolean devolucao) {
        this.devolucao = devolucao;
    }

    public BigDecimal getValorLimiteNoturno() {
        return valorLimiteNoturno;
    }

    public void setValorLimiteNoturno(BigDecimal valorLimiteNoturno) {
        this.valorLimiteNoturno = valorLimiteNoturno;
    }

    public void devolverDinheiro() {
        System.out.println("Devolver Dinheiro!");
    }

    @Override
    public void transferir() {
        if (devolucao) {
            System.out.println("Devolução feita com sucesso!");
        } else {
            System.out.println("Transferência pix feita com sucesso!");
        }
    }

    @Override
    public String toString() {
        return "Pix{" +
                "devolucao=" + devolucao +
                ", valorLimiteNoturno=" + valorLimiteNoturno +
                ", valor=" + getValor() +
                ", contaOrigem=" + getContaOrigem() +
                '}';
    }
}
