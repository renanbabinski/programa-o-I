import java.util.Scanner;
public class Programa{

	public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
   }

   	public static void getchar(){
   		Scanner scanf = new Scanner(System.in);
   		System.out.println("\nPressione ENTER para continuar...");
		scanf.nextLine();
   	}

	public static void main(String[] args){
		int menu = 0;
		Conta minhaConta = new Conta();
		Scanner scanf = new Scanner(System.in);

		do{
			clearScreen();
			menu = minhaConta.mostrarmenu();
			switch(menu){
				case 1:
					minhaConta.Saldo();
					break;
				case 2:
					minhaConta.saque();
					break;
				case 3:
					minhaConta.depositar();
					break;
				case 4:
					minhaConta.transferencia();
					break;
				case 5:
					minhaConta.showdetails();
					break;
				case 6:
					break;
				default:
					System.out.println("Opção inválida!");
					getchar();
					break;
			}
		}while(menu != 6);
	}
}
