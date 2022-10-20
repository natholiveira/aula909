package carro;

public class ExemploEncapsulamentoCarro {

    public static void main(String[] args) {
        Carro carro = new Carro(4, "azul", "AAAAEAA", "Nissan");

        pintarCarro("azul", carro);

        atualizarPlacaParaMercosul(carro);

    }

    public static void pintarCarro(String cor, Carro carro) {
        if (!cor.equals(carro.getCor())) {
            carro.setCor(cor);
            System.out.println("A cor do carro foi pintada para "+carro.getCor());
        } else {
            System.out.println("A cor do carro já é "+cor);
        }
    }

    public static void atualizarPlacaParaMercosul(Carro carro) {
        StringBuilder placaDoCarro = new StringBuilder(carro.getPlaca());

        if (Character.isDigit(placaDoCarro.charAt(4))) {
            placaDoCarro.setCharAt(4, 'A');
            carro.setPlaca(placaDoCarro.toString());
            System.out.println("Placa atualizada para "+ carro.getPlaca());
        } else {
            System.out.println("Placa já é do Mercosul");
        }
    }
}
