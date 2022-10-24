import carro.Carro;

import java.time.LocalDate;

public class Funcionario {

    public Integer id;
    public Double salario;
    public Double desconto;
    public Double bonus;

    public String nome;

    public final String cpf;

    public LocalDate data;

    public Carro carro;

    public Funcionario(
            Double salario,
            Double desconto,
            Double bonus,
            String nome,
            String cpf,
            LocalDate data
    ) {
        this.salario = salario;
        this.desconto = desconto;
        this.bonus = bonus;
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
    }

    public Funcionario(
            Double salarioFuncionario,
            Double descontoFuncionario,
            String nomeFuncionario,
            String cpf) {
        salario = salarioFuncionario;
        desconto = descontoFuncionario;
        nome = nomeFuncionario;
        this.cpf = cpf;
    }

    public Funcionario(
            Double salarioFuncionario,
            Double descontoFuncionario,
            String cpf) {
        salario = salarioFuncionario;
        desconto = descontoFuncionario;
        this.cpf = cpf;
    }

    public Funcionario(String cpf) {
        this.cpf = cpf;
    }


    public double calcularPagamento() {
        return salario + bonus - desconto;
    }

    public void imprimir() {
        System.out.println("Nome funcionario: "+nome);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", salario=" + salario +
                ", desconto=" + desconto +
                ", bonus=" + bonus +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", data=" + data +
                ", carro=" + carro +
                '}';
    }
}
