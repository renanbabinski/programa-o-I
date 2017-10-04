import java.util.Scanner;
import java.util.List;
public class Principal{

	public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
   }

   public static int mostrarMenu(){
   		int menu;
   		Scanner scanf = new Scanner(System.in);
   		System.out.println("   ->>>>>  BODEGA DO SEU JOÃOZIN  <<<<<-\n\n");
   		System.out.println("        A MELHOR DO SUL DO PAÍS !!!\n\n");
   		System.out.println("1--Contratar funcionarios");
   		System.out.println("2--Exibir funcionarios");
   		System.out.println("3--Exibir bebidas a venda");
   		System.out.println("4--Cadastrar novas bebidas");
   		System.out.println("5--Vender Bebida");
   		System.out.println("0--EXIT\n");
   		menu = scanf.nextInt();
   		return menu;
   }

   public static void getchar(){
   	Scanner scanf = new Scanner(System.in);
   	System.out.println("\nPressione ENTER para continuar...");
   	scanf.nextLine();
   }

////////////////////////////////////////////////

	public static void main(String [] args){
		Empresa empresa = new Empresa();
		Iniciar iniciar = new Iniciar();
		Bebida bebida = new Bebida();
		Scanner scanf = new Scanner(System.in);

		int menu = 10;
		
		iniciar.init(empresa);

		do{
			clearScreen();
			menu = mostrarMenu();
			switch(menu){
				case 1:
					empresa.contratar();
					break;
				case 2:
					empresa.ExibirFuncionarios();
					getchar();
					break;
				case 3:
					empresa.ExibirBebidas(0);
					getchar();
					break;
				case 4:
					empresa.cadastrar_bebidas();
					break;
				case 5:
					bebida.vender(empresa);
				case 0:
					break;
				default:
					break;
			}
		}while(menu != 0);



	}
	
}