public class Sistema{
	
	public static void main(String[] args){
		
		Disciplina d = new Disciplina(23,"Programação I",4);
		System.out.println(d);
		
		Aluno a = new Aluno("Gustavo",1621101015);
		System.out.println(a);
		
		a.matricular(d);
		a.listarDisciplinas();
		
	}
}
