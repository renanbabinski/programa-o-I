import java.util.Scanner;
class loop{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int x;
		System.out.println("Digite um numero :");
		x = entrada.nextInt();
		while(x != 1){
			if(x % 2 == 0){
				x = x/2;
			}else{
				x = x*3 + 1;
			}
			System.out.print("-> " +x);
		}
		System.out.println("");
	}
}