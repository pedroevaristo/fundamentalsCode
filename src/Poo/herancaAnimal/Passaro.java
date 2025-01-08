package Poo.herancaAnimal;

public class Passaro extends Animal{

	private final Boolean voar; 
	public Passaro(String nome, String raca, int idade, Boolean voar) {
		super(nome, raca, idade);
		this.voar = voar;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O passaro fica assoviando. Caracteristica única:"+);
	}
}
