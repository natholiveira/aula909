package reino_animal;

import java.time.LocalTime;

public class Zoologico {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(
                "caramelo",
                "amora",
                "casa",
                16.0,
                4,
                "Preto",
                "Ana"
        );

        cachorro.reagir("Beatriz");
        cachorro.reagir(LocalTime.of(19,0,0));
        cachorro.reagir(LocalTime.of(19,0,0), "Ana");
    }
}
