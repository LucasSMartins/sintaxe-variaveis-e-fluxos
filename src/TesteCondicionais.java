
public class TesteCondicionais {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 16;
		int quantidadePessoas = 2;
		
		if(idade >= 18){
			System.out.println("Você pode entrar");
			System.out.println("Bem vindo!");
		}else {
			if(quantidadePessoas >= 2){
				System.out.println("Você não tem 18, "
						+ "mas está acompanhado, pode entrar");
			}else {
				System.out.println("Infelizmente não pode entrar");
				
			}
	}

	}
}
