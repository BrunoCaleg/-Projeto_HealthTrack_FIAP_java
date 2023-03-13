
public class Dashboard extends ObjetivoFinanceiro {

	private double saldoMes;
	private double gastoMes;
	private double recebidoMes;

	public Dashboard(double saldoMes, double gastoMes, double recebidoMes) {
		this.saldoMes = saldoMes;
		this.gastoMes = gastoMes;
		this.recebidoMes = recebidoMes;
	}

	public void adicionarGastoNoMes(double valor) {
		if (valor <= 0) {
			System.out.println("Adicione um valor maior que 0.");
			return;
		}
		this.saldoMes -= valor;
		this.gastoMes += valor;
	}

	public void adicionarRecebidoNoMes(double valor) {
		if (valor <= 0) {
			System.out.println("Adicione um valor maior que 0.");
			return;
		}
		this.saldoMes += valor;
		this.recebidoMes += valor;

	}

	public double getGastoMes() {
		return gastoMes;
	}

	public void setGastoMes(double gastoMes) {
		this.gastoMes = gastoMes;
	}

	public double getRecebidoMes() {

		return recebidoMes;
	}

	public void setRecebidoMes(double recebidoMes) {
		this.recebidoMes = recebidoMes;
	}

	public double getSaldoMes() {
		return saldoMes;
	}

}
