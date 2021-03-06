import java.util.Scanner;
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
   		System.out.println("6--Cadastrar novos clientes");
   		System.out.println("7--Mostrar clientes");
   		System.out.println("8--Comprar mais bebidas");
   		System.out.println("9--Exibir dados da empresa");
   		System.out.println("0--EXIT\n");
   		menu = scanf.nextInt();
   		return menu;
   }

   public static void getchar(){
   	Scanner scanf = new Scanner(System.in);
   	System.out.println("\nPressione ENTER para continuar...");
   	scanf.nextLine();
   }

/////////////////////////////////////////////////////////////////////////   

	public static void main(String [] args){
		Empresa empresa = new Empresa();
		Iniciar iniciar = new Iniciar();
		Bebida bebida = new Bebida();
		Scanner scanf = new Scanner(System.in);
		iniciar.init(empresa);

		int menu = 10;
		
		do{
			clearScreen();
			menu = mostrarMenu();
			switch(menu){
				case 1:
					empresa.contratar();
					getchar();
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
					getchar();
					break;
				case 6:
					empresa.cadastra_clientes();
					getchar();
					break;
				case 7:
					empresa.ExibirClientes();
					getchar();
					break;
				case 8:
					bebida.comprar(empresa);
					getchar();
					break;
				case 9:
					System.out.println(empresa);
					getchar();
				case 0:
					break;
				default:
					System.out.println("Opção inválida!!");
					getchar();
					break;
			}
		}while(menu != 0);
	}
}