package Main;

import Model.Arara;
import Model.Ambiente;
import Model.Animais;
import Model.Elefante;
import Model.Tubarao;
import Model.Zoologico;

public class Main {
    public static void main(String[] args) {
        /* Zoologico de Cajazeiras */

        Ambiente ambiente = new Ambiente(3);

        Arara arara1 = new Arara(
                4,
                true,
                "Arara",
                true,
                1001,
                2,
                "Azul"
        );

        Elefante elefante1 = new Elefante(
                "Elefante",
                4,
                true,
                true,
                1002,
                4,
                "Cinza"
        );
        Tubarao tubarao1 = new Tubarao(
                true,
                "Tubarão-Branco",
                true,
                1003,
                4,
                "Branco"
        );

        ambiente.setListaDeAnimais(0, arara1);
        ambiente.setListaDeAnimais(1, elefante1);
        ambiente.setListaDeAnimais(2, tubarao1);

        Zoologico Zoologico1 = new Zoologico(
                "Zoologico de Cajazeiras", ambiente
        );
        System.out.println(Zoologico1.getAmbiente());
    }
}