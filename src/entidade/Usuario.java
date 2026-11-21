package entidade;

public class Usuario {

    public String email;
    public String senha;

    public Usuario(String email, String senha) {
        System.out.println("AUTENTICAÇÃO POR EMAIL E SENHA");
    }

    public Usuario(String telefone) {
        System.out.println("AUTENTICAÇÃO POR TELEFONE");
    }

    public Usuario(String telefone, int cep) {
        System.out.println("AUTENTICAÇÃO POR TELEFONE E CEP");
    }
}
