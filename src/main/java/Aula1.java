import carro.Carro;

import java.time.LocalDate;
import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args) {

        int resultado = soma(10, 20);

        System.out.println("Resultado da soma é: "+resultado);

        Funcionario gerente = new Funcionario("999.999.999-99");
        gerente.salario = 10000.0;
        gerente.bonus = 400.0;
        gerente.desconto = 100.0;
        gerente.nome = "jefferson";

        double pagamento = gerente.calcularPagamento();

        Funcionario estagiario = new Funcionario("999.999.999-99");
        estagiario.salario = 1000.0;
        estagiario.bonus = 100.0;
        estagiario.desconto = 50.0;
        estagiario.nome = "josefino";

        Carro carro = new Carro();

        Scanner ler = new Scanner(System.in);
        Double salarioCoordenador = ler.nextDouble();

        Double bonusCoordenador = ler.nextDouble();

        Funcionario coordenador = new Funcionario(
                salarioCoordenador,
                500.0,
                bonusCoordenador,
                "Samuel",
                "999.999.999-99",
                LocalDate.now(),
                carro
        );

        Funcionario ceo = new Funcionario(80000.0, 2000.0, "999.999.999-99");
        ceo.nome = "renato";
        ceo.bonus = 1000.0;

        Funcionario recepcionista = new Funcionario(
                2000.0,
                300.0,
                "fernando",
                "999.999.999-99"
        );

        recepcionista.imprimir();

        System.out.println("recepcionista "+recepcionista);

        double pagamentoEstagiario = estagiario.calcularPagamento();

        estagiario.imprimir();

        String texto = "valor";
        Funcionario rh = new Funcionario("999.999.999-99");

        String marca = "";





        System.out.println("Pagamento do gerente é: "+pagamento);
        System.out.println("Pagamento do estágiario "+estagiario.nome+" é: "+pagamentoEstagiario);

    }

    private static void darOi() {
        System.out.println("oi");
    }

    public static int soma(int valor1, int valor2) {
        int resultadoSoma = valor1 + valor2;

        return resultadoSoma;
    }
}
