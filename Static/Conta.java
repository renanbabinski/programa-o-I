public class Conta{
	
	int cod;
	double saldo;
	static int QuantidadeDeContas;
	
	public Conta(int cod,double saldo){
		this.cod = cod;
		this.saldo = saldo;
		this.QuantidadeDeContas++;
		
	}
}
