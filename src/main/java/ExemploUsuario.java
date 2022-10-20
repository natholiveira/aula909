public class ExemploUsuario {
    public static void main(String[] args) {
        Usuario novoUsuario = criarUsuario();

        String novaSenhaCriptografada = criptografarSenha(novoUsuario.getSenha());

        novoUsuario.setSenha(novaSenhaCriptografada);
    }

    public static Usuario criarUsuario() {
        Usuario novoUsuario = new Usuario("anderson", "1234");
        return novoUsuario;
    }

    public static String criptografarSenha(String senha) {
        return "*******";
    }
}
