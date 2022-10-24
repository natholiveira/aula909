package carro;

import java.util.Random;

public class Aluguel {
    public static void main(String[] args) {

        Veiculo veiculo = pegarVeiculoAleatorio();

        System.out.println(veiculo);

        veiculo.ligar();

        Moto moto = new Moto();
        moto.setCor("vermelho");
        moto.setMarca("Kawasaki");
        moto.setPlaca("AAAEEE");

        Veiculo veiculo1 = new Moto("amarela", "QQEEER", "Kawasaki", "modelo baixo");
        veiculo1.ligar();

        Veiculo veiculo2 = new Carro("preto", "QQEETT", "Audi", 2);
        veiculo2.ligar();

    }

    public static Veiculo pegarVeiculoAleatorio() {
        Carro carro1 = new Carro("preto", "AAABBB", "Audi",4);

        Carro carro2 = new Carro("azul", "BBBABB", "Nissan",2);

        Moto moto1 = new Moto("vermelho", "CCCABB", "Honda", "modelo top");

        Moto moto2 = new Moto("azul", "NNNEEFF", "BMW", "modelo mt top");

        Random gerador = new Random();

        int valorAleatorio = gerador.nextInt(4);

        switch (valorAleatorio) {
            case 0 : return moto1;
            case 1 : return moto2;
            case 2 : return carro1;
            default: return carro2;
        }
    }
}
