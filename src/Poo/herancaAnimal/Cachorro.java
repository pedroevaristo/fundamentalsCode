package Poo.herancaAnimal;

public class Cachorro extends Mamifero {

	public Cachorro(String nome, String raca, int idade) {
		super(nome, raca, idade, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	 public void emitirSom() {
		System.out.println("Cachorro late \n");
	}

	@Override
	public void amamentar() {
		System.out.println("O cachorro amamenta.\n");
	}

	@Override
	public void mover() {
		System.out.println("O cachorro corre todo feliz.\n");
	}

}
