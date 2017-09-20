public class Aluno{
	
	Disciplina[] disciplinas = new Disciplina[5];
	String nome;
	int matricula;
	int qtddis;
	
	public Aluno(String nome,int matricula){
		this.nome = nome;
		this.matricula = matricula;
		this.qtddis = 0;
	}
	
	public String toString(){
		return "\nAluno : "+this.nome+"\nMatricula: "+this.matricula+"\n";
	}
	
	public void listarDisciplinas(){
		for(Disciplina dis : disciplinas)
			System.out.println(dis);
	}
	
	public void matricular(Disciplina d){
		this.disciplinas[qtddis] = d;
		qtddis++;
	}
	
}

