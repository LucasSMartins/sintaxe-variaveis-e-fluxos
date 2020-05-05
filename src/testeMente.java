public class testeMente {
	public static void main(String[] args) {
		System.out.println("Bom dia cliente!");
		
		String name = "Berg";
		int years = 23;
		double salary = 1000.00;
		
		System.out.println("Seu nome " + name);
		System.out.println("Sua idade " + years);
		System.out.println("Seu salário " + salary);
		
		if(years >= 18) {
			System.out.println("Berg você pode entrar nessa festa!");
		}
		int numbers = 0;
		
		while(numbers <= 10) {
			System.out.println(numbers);
			numbers++;
		}
		for(int contador = 0; contador <= 100; contador++) {
			
			System.out.println(contador);
		}
		
		
	}
}
