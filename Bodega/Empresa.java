import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Empresa{
	String nomeEmpresa = "BODEGA DO SEU JOÃOZIN";
	String cnpj = "56.586.568.0001-68";
	List<Funcionario> bodegueiros = new ArrayList<>();
	List<Bebida> produtos = new ArrayList<>();
	List<Clientes> cachaceiros = new ArrayList<>();

	Scanner scanf = new Scanner(System.in);

	public String toString(){
		return "\nNome da empresa : "+this.nomeEmpresa+"\nCNPJ da empresa : "+cnpj;
	}

	public void contrata(Funcionario x){
		bodegueiros.add(x);
	}

	public void contratar(){
		System.out.println("Digite o nome do funcionário:");
		String nome = scanf.nextLine();
		System.out.println("Digite o CPF do funcionário ( FORMATO XXX.XXX.XXX-XX ) ");
		String cpf = scanf.next();
		System.out.println("Digite o salário : ");
		double salario = scanf.nextDouble();
		Funcionario a = new Funcionario(nome,cpf,salario);
		contrata(a);
	}

	public void ExibirFuncionarios(){
		int i = 1;
		for(Funcionario l : bodegueiros){
			System.out.println("\n->>> "  +i+ "");
			System.out.println(l);
			i++;
		}
	}

	public void add_bebidas(Bebida x){
		produtos.add(x);
	}

	public void cadastrar_bebidas(){
		System.out.println("Nome da bebida:");
		String nome = scanf.nextLine();
		System.out.println("Teor Alcólico:");
		double teor = scanf.nextDouble();
		System.out.println("Quantidade (ml):");
		int quantidade = scanf.nextInt();
		System.out.println("Preço:");
		double preco = scanf.nextDouble();
		System.out.println("Quantidade em estoque:");
		int estoque = scanf.nextInt();
		Bebida x = new Bebida(nome,teor,quantidade,preco,estoque);
		add_bebidas(x);
	}

	public void ExibirBebidas(int opcao){
		int i = 1;
		for(Bebida l : produtos){
			System.out.println("\n->>> "  +i+ "");
			if(opcao == 0)
				System.out.println(l);
			else
				System.out.println(l.nome);
			i++;
		}
	}

	public void clientes(Clientes x){
		cachaceiros.add(x);
	}

	public void cadastra_clientes(){
		boolean fiado;
		System.out.println("Nome do cliente:");
		String cliente = scanf.nextLine();
		System.out.println("CPF do cliente (formato XXX.XXX.XXX-XX):");
		String cpf = scanf.next();
		System.out.println("Vender fiado?\n1--SIM\n0--NÃO");
		if(scanf.nextInt() == 1)
			fiado = true;
		else
			fiado = false;
		Clientes x = new Clientes(cliente,cpf,fiado);
		clientes(x);
	}

	public void ExibirClientes(){
		int i = 1;
		for(Clientes l: cachaceiros){
			System.out.println("\n->>> "  +i+ "");
			System.out.println(l);
			i++;
		}
	}
}

