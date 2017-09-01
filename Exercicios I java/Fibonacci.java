class loop{
	public static void main(String[] args){
		int a = 0,b = 1,aux = 0;
		while (b<=100){
			if(a == 0 && b == 1){
				System.out.print(a+ "-->" +b);
			}else{
				System.out.print("-->" +b);
			}			
				aux = a + b;
				a = b;
				b = aux;
		}
		System.out.println("");
	}
}