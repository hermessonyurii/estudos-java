package programa;

import entidade.*;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        Programador programador = new Programador();
        DevWeb devWeb = new DevWeb();

        programador.candidatarPresidentel();
        devWeb.Presidente();
    }
}