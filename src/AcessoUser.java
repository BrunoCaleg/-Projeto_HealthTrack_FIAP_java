
public class AcessoUser extends CadastroUser {

	private String idUser;

	public AcessoUser(String nome, String email, String senha) {
		super.setNome(nome);
		super.setEmail(email);
		super.setSenha(senha);

	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public boolean verificarSenha(String senhaDigitada) {
		boolean autenticado = super.getSenha().equals(senhaDigitada);
		if (autenticado) {
			System.out.println("Autenticação bem-sucedida! " + "Olá, " + super.getNome());
		} else {
			System.out.println("Senha incorreta!");
		}
		return autenticado;
	}
}
