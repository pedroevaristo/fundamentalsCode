package Poo.herancaAnimal;

public class Cachorro extends Animal{

	public Cachorro(String nome, String raca, int idade) {
		super(nome, raca, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Cachorro late");
	}

}
