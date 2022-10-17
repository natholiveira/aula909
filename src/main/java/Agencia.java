public class Agencia {

    public static void main(String[] args) {
        Conta contaMaria = new Conta("maria", "1234", "999.999.999-99", 100.0);
        Conta contaJose = new Conta("jose", "4321", "111.111.111-11", 30.0);
        Conta contaExemplo = new Conta("444.444.444-44", "andre");
        Conta construtorVazio = new Conta();

        sacar(20.0, contaMaria);

        transferir(35.0, contaMaria, contaJose);

        pagar(55.0, contaMaria);

        contaMaria.getTitular();

        System.out.println(contaMaria);
        System.out.println(contaJose);
    }

    public static void sacar(Double valor, Conta conta) {
        Double novoSaldo = conta.getSaldo() - valor;

        conta.setSaldo(novoSaldo);
    }

    public static void transferir(Double valor, Conta contaOrigem, Conta contaDestino) {
        Double novoSaldoContaOrigem = contaOrigem.getSaldo() - valor;
        contaOrigem.setSaldo(novoSaldoContaOrigem);

        Double novoSaldoContaDestino = contaDestino.getSaldo() + valor;
        contaDestino.setSaldo(novoSaldoContaDestino);
    }

    public static void pagar(Double valor, Conta conta) {
        Double novoSaldo = conta.getSaldo() - valor;

        conta.setSaldo(novoSaldo);
    }
}
