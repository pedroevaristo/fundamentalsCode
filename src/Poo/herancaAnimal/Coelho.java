package Poo.herancaAnimal;

public class Coelho extends Animal{

	public Coelho(String nome, String raca, int idade) {
		super(nome, raca, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O Coelho bate os pés.");	}
	
}
