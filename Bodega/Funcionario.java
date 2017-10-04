import java.util.Scanner;
import java.util.List;
public class Funcionario{
	String nome;
	String cpf;
	double salario;

	Empresa empresa = new Empresa();

	public Funcionario(){
	}
	
	public Funcionario(String nome,String cpf,double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String toString(){
		return "\nFuncionário : "+this.nome+"\nCPF : "+this.cpf+ "\nSalário : "+this.salario+"\n";
	}

	public void ExibirFuncionarios(){
		for(Funcionario l : empresa.bodegueiros)
			System.out.println(l);
	}
}