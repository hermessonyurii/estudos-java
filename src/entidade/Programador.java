package entidade;

public class Programador extends Pessoa implements Presidenciavel{


    @Override
    public void candidatarPresidentel() {
        System.out.println("Candidatar a Presidente");
    }
}
