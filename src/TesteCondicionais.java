
public class TesteCondicionais {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 16;
		int quantidadePessoas = 2;
		
		if(idade >= 18){
			System.out.println("Voc� pode entrar");
			System.out.println("Bem vindo!");
		}else {
			if(quantidadePessoas >= 2){
				System.out.println("Voc� n�o tem 18, "
						+ "mas est� acompanhado, pode entrar");
			}else {
				System.out.println("Infelizmente n�o pode entrar");
				
			}
	}

	}
}
