import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Empresa{
	String nomeEmpresa = "BODEGA DO SEU JOÃOZIN";
	String cnpj = "56.586.568.0001-68";
	List<Funcionario> bodegueiros = new ArrayList<>();
	List<Bebida> produtos = new ArrayList<>();

	Scanner scanf = new Scanner(System.in);




	public void contrata(Funcionario x){
		bodegueiros.add(x);
	}

	public void contratar(){
		System.out.println("Digite o nome do funcionário:");
		String nome = scanf.next();
		System.out.println("Digite o CPF do funcionário ( FORMATO XXX.XXX.XXX-XX ) ");
		String cpf = scanf.next();
		System.out.println("Digite o salário : ");
		double salario = scanf.nextDouble();
		Funcionario a = new Funcionario(nome,cpf,salario);
		contrata(a);
	}




}

