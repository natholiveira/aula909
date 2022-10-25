package reino_animal;

import java.time.LocalTime;

public class Cachorro extends Mamimefero {
    private String corFucinho;

    private String dono;

    public Cachorro(String cor, String nome, String ambiente, Double velocidadeMedia, int quantidadePatas, String corFucinho, String dono) {
        super(cor, nome, ambiente, velocidadeMedia, quantidadePatas);
        this.corFucinho = corFucinho;
        this.dono = dono;
    }

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo");
    }

    public void reagir(String dono) {
        if (dono == this.dono) {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Cachorro vai latir");
        }
    }

    public void reagir(LocalTime hora) {
        LocalTime horaTrabalho = LocalTime.of(18,0,0);
        if (hora.isAfter(horaTrabalho)) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Abanar o rabo");
        }
    }

    public void reagir(LocalTime hora, String dono) {
        LocalTime horaTrabalho = LocalTime.of(18,0,0);
        if (hora.isAfter(horaTrabalho) && dono == this.dono) {
            System.out.println("Abanar o rabo");
        } else if (hora.isAfter(horaTrabalho)) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Latir");
        }
    }

    public String getCorFucinho() {
        return corFucinho;
    }

    public void setCorFucinho(String corFucinho) {
        this.corFucinho = corFucinho;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return super.toString() + "Cachorro{" +
                "corFucinho='" + corFucinho + '\'' +
                "dono='" + dono + '\'' +
                '}';
    }
}
