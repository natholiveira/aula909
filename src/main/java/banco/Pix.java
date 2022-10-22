package banco;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pix extends Transferencia {

    private boolean devolvida;

    private BigDecimal valorLimiteNoturno;

    public Pix(
            BigDecimal valor,
            Conta contaOrigem,
            Conta contaDestino,
            boolean devolvida
    ) {
        super(valor, contaOrigem, contaDestino, LocalDate.now(), TipoTransferencia.PIX);
        this.devolvida = devolvida;
        this.valorLimiteNoturno = BigDecimal.valueOf(1000.0);
    }

    public void devolverDinheiro() {
        System.out.println("Devolver Dinheiro!");
    }

    @Override
    public void transferir() {
        System.out.println("Transferência pix feita com sucesso!");
    }
}
