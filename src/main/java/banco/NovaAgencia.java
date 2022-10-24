package banco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class NovaAgencia {

    public static void main(String[] args) {
        Conta contaMaria = new Conta("maria", "1234", "999.999.999-99", 100.0);
        Conta contaJose = new Conta("jose", "4321", "111.111.111-11", 30.0);

        Scanner scanner = new Scanner(System.in);
        BigDecimal valor = scanner.nextBigDecimal();

        Transferencia transferencia = new Transferencia(
                valor,
                contaMaria,
                contaJose,
                LocalDate.now(),
                TipoTransferencia.TED
        );

        System.out.println(transferencia);

        Pix novoPix = new Pix(
                BigDecimal.TEN,
                contaMaria,
                contaJose,
                false
        );

        Ted novoTed = new Ted(
                BigDecimal.ONE,
                contaJose,
                contaMaria,
                LocalDate.now()
        );

        transferencia.transferir();
        novoPix.transferir();
        novoTed.transferir();
    }

}
