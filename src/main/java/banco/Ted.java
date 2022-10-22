package banco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ted extends Transferencia {
    private LocalTime horaLimite;

    public Ted(
            BigDecimal valor,
            Conta contaOrigem,
            Conta contaDestino,
            LocalDate dataTransferencia
    ) {
        super(valor, contaOrigem, contaDestino, dataTransferencia, TipoTransferencia.TED);
        this.horaLimite = LocalTime.of(18, 0, 0);
    }

    @Override
    public void transferir() {
        System.out.println("Transferência Ted com sucesso!");
    }
}
