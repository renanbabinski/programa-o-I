import java.util.Scanner;
public class Conta{
	int numero;
	String dono;
	double saldo;
	Scanner scanf = new Scanner(System.in);

	public void depositar(double valor){
		this.saldo += valor;
	}
	public void saque(double valor){
		this.saldo -= valor;
	}
	public int mostrarmenu(){
		System.out.println("1--Consultar Saldo");
		System.out.println("2--Efetuar saque");
		System.out.println("3--Efetuar depósito");
		System.out.println("4--Efetuar transfêrencia");
		System.out.println("5--Exibir dados da conta");
		System.out.println("6--EXIT");
		menu = scanf.nextInt();
		return menu;
	}
}
