public class Sobrecarga {

    public static void main(String[] args) {
        int resultadoSoma2Numeros = somarNumeros(10, 20);
        double resultadoSoma3Numeros = somarNumeros(10, 20, 30);

        cadastrarConta("1234");
        cadastrarConta("ana Julia", "12345");

        System.out.println("Soma 2 numeros = " +resultadoSoma2Numeros);
        System.out.println("Soma 3 numeros = "+resultadoSoma3Numeros);
    }

    private static int somarNumeros(int valor1, int valor2) {
        return valor1 +  valor2;
    }

    public static double somarNumeros(double valor1, double valor2, double valor3) {
        return valor1 + valor2 + valor3;
    }

    public static void cadastrarConta(String pessoa, String conta) {

    }

    public static void cadastrarConta(String conta) {

    }
}
