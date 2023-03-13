
public class ObjetivoFinanceiro {

	private String tipoInvestimento;
	private double valorAplicado;
	private String objetivo;

	public ObjetivoFinanceiro() {
	}

	public ObjetivoFinanceiro(String tipoInvestimento, double valorAplicado, String objetivo) {
		this.tipoInvestimento = tipoInvestimento;
		this.valorAplicado = valorAplicado;
		this.objetivo = objetivo;
	}

	public String getTipoInvestimento() {
		return tipoInvestimento;
	}

	public void setTipoInvestimento(String tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}

	public double getValorAplicado() {
		return valorAplicado;
	}

	public void setValorAplicado(double valorAplicado) {
		this.valorAplicado = valorAplicado;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public void adicionarSaldoInvestido(double valor) {
		if (valor <= 0) {
			System.out.println("Adicione um valor maior que 0.");
			return;
		}
		this.valorAplicado += valor;
	}
}
