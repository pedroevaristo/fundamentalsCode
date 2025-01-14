package Poo.herancaAnimal;

public class Cachorro extends Mamifero{

	public Cachorro(String nome, String raca, int idade) {
		super(nome, raca, idade, true);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Cachorro late");
	}
	@Override
	public void amamentar() {
		System.out.println("O cachorro amamenta.");
	}

}
