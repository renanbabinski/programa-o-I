import java.util.Scanner;
public class Conta{
	int numero = 1621101015;
	String dono = "Renan Luiz Babinski";
	double saldo = 0.00;
	Scanner scanf = new Scanner(System.in);
	Programa programa = new Programa();
	ContaADM Contaprincipal = new ContaADM();

	public void Saldo(){
		System.out.println("\nSaldo:   " +saldo+"\n");
		Programa.getchar();
	}

	public void depositar(){
		double valor;

		System.out.println("Digite o valor que quer depositar:");
		valor = scanf.nextDouble();
		this.saldo += valor;
		System.out.println("Depositado!");
		Programa.getchar();
	}

	public void saque(){
		double valor;
		System.out.println("Digite o valor a sacar:");
		valor = scanf.nextDouble();
		if(valor > this.saldo){
			System.out.println("Você não tem fundos suficientes para sacar esse valor!");
			Programa.getchar();
		}else{
			this.saldo -= valor;
			System.out.println("Sacado!");
			Programa.getchar();
		}
	}

	public void transferencia(){
		double valor;

		System.out.println("Digite o valor para tranferir para Priscila:");
		valor = scanf.nextDouble();
		if(valor > this.saldo){
			System.out.println("Você não tem fundos suficientes para tranferir");
			Programa.getchar();
		}else{
			this.saldo -= valor;
			Contaprincipal.saldo += valor;
			System.out.println("Transferido!");
			Programa.getchar();
		}
	}

	public void showdetails(){
		System.out.println("     Sua Conta \n\nNúmero: "+numero+ "\nDono ; "+dono+"\nSaldo: "+saldo);
		System.out.println("\n     Conta principal\n\nNúmero: "+Contaprincipal.numero+ "\nDono ; "+Contaprincipal.dono+"\nSaldo: "+Contaprincipal.saldo);
		Programa.getchar();
	}

	public int mostrarmenu(){
		int menu;
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
