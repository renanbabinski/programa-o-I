public class Programa{
	public static void main(String[] args){
		Conta minhaConta = new Conta();
		minhaConta.dono="Renan Luiz Babinski";
		minhaConta.saldo = 5000;
		minhaConta.numero = 1621101015;

		System.out.println(minhaConta.dono +"\n"+minhaConta.saldo+"\n"+minhaConta.numero );

		System.out.println("Saldo :" + minhaConta.saldo);
		minhaConta.depositar(800.8);
		System.out.println("Saldo :" + minhaConta.saldo);
		minhaConta.saque(800.8);
		System.out.println("Saldo :" + minhaConta.saldo);

		}
}
