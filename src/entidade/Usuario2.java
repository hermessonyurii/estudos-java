package entidade;

public class Usuario2 {

    public String email;
    public String senha;

    public void logar(String telefone){
        System.out.println("Logar com telefone");
    }
    public void logar(String email, String senha){
        System.out.println("Logar com email e senha");
    }
}
