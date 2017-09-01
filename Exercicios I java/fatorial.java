class loop{
	public static void main(String[] args){
		int i,fatorial=1;
		for (i=1;i<=10;i++){
			fatorial = fatorial * i;
			System.out.println("Fatorial de "+i+" é: " +fatorial);
		}
	}
}

/*quando atribuidos valores acima de 14 para calcular o fatorial
o resultado ultrapassa o tamanho em bytes alocado para a variavel (int nesse caso),
mostrando valores negativos e a partir de 34 valores zerados.
	Uma solução seria usar variaveis maiores como um long int ou long long int para conseguir imprimir mais alguns fatorias :)
*/


