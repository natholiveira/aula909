public class ExemploUsuario {
    public static void main(String[] args) {
        Usuario novoUsuario = criarUsuario();

        String novaSenhaCriptografada = criptografarSenha(novoUsuario.getSenha());

        novoUsuario.setSenha(novaSenhaCriptografada);
    }

    public void atualizaLogin(String novoLogin, Usuario usuario) {
        usuario.setLogin("login default");
    }

    public static Usuario criarUsuario() {
        Usuario novoUsuario = new Usuario("anderson", "1234", "asdas");
        return novoUsuario;
    }

    public static String criptografarSenha(String senha) {
        return "*******";
    }
}
