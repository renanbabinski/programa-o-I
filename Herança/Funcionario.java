public class Funcionario{
	protected String nome;
	protected String cpf;
	protected double salario;

	public Funcionario(String nome,double salario){
		this.nome = nome;
		this.salario = salario;
	}

	public String toString(){
		return "\nFuncionario : "+this.nome+"\nCPF : "+this.cpf+"\nSalário : "+this.salario;
	}

	public void exibeDados(){
		System.out.println("\nDados:");
		System.out.println()	
	}



}