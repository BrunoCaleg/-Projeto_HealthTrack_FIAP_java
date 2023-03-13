import java.util.Scanner;

public class testeSistema {

	public static void main(String[] args) {

		AcessoUser user = new AcessoUser("Bruno", "bruno@gmail.com", "senha123");
		ObjetivoFinanceiro estante = new ObjetivoFinanceiro("Criptomoeda", 2000, "Comprar uma estante");
		Dashboard dashboard = new Dashboard(1000, 20, 50);

		dashboard.adicionarSaldoInvestido(estante.getValorAplicado());

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite sua senha: ");
		String senha = scanner.nextLine();

		if (user.verificarSenha(senha)) {
			System.out.println("Saldo do mês: " + dashboard.getSaldoMes());
			System.out.println("Gasto do mês: " + dashboard.getGastoMes());
			System.out.println("Recebido no mês: " + dashboard.getRecebidoMes());
			System.out.println("Saldo investido: " + dashboard.getValorAplicado());
		}
		scanner.close();
	}
}