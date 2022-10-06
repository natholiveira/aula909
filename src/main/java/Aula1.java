import bairro2.Carro;

public class Aula1 {

    public static void main(String[] args) {

        int resultado = soma(10, 20);

        System.out.println("Resultado da soma é: "+resultado);

        Funcionario gerente = new Funcionario();
        gerente.salario = 10000;
        gerente.bonus = 400;
        gerente.desconto = 100;
        gerente.nome = "jefferson";

        double pagamento = gerente.calcularPagamento();

        Funcionario estagiario = new Funcionario();
        estagiario.salario = 1000;
        estagiario.bonus = 100;
        estagiario.desconto = 50;
        estagiario.nome = "josefino";

        double pagamentoEstagiario = estagiario.calcularPagamento();

        String texto = "valor";
        Funcionario rh = new Funcionario();

        String marca = "";

        Carro fusca = new Carro();
        fusca.cor = "preto";
        fusca.marca = marca;
        fusca.numeroPortas = 2;
        fusca.placa = "XPTO";

        Carro kombi = new Carro();
        kombi.cor = "branca";
        kombi.marca = marca;
        kombi.numeroPortas = 4;
        kombi.placa = "ABCD";

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
