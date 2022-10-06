public class Funcionario {
    public double salario;
    public double desconto;
    public double bonus;

    public String nome;

    public double calcularPagamento() {
        return salario + bonus - desconto;
    }
}
