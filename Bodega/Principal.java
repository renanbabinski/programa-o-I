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
   		System.out.println("0--EXIT\n");
   		menu = scanf.nextInt();
   		return menu;
   }

////////////////////////////////////////////////

	public static void main(String [] args){
		Empresa empresa = new Empresa();
		Funcionario funcionario = new Funcionario();
		Scanner scanf = new Scanner(System.in);

		int menu = 10;

		///////////////////////////////

		Funcionario a = new Funcionario("Manoel","085.213.279-43",1000.00);
		empresa.contrata(a);
		Funcionario b = new Funcionario("Carlão da Bodega","043.587.945-99",800.00);
		empresa.contrata(b);
		Funcionario c = new Funcionario("Antonio","055.214.897-00",500.00);
		empresa.contrata(c);		

		///////////////////////////////

		do{
			clearScreen();
			menu = mostrarMenu();
			switch(menu){
				case 1:
					empresa.contratar();
					break;
				case 2:
					funcionario.ExibirFuncionarios();
					break;
				case 0:
					break;
				default:
					break;
			}
		}while(menu != 0);

		for(Funcionario l : empresa.bodegueiros)
			System.out.println(l);






	}
	
}