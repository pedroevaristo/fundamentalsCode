package Poo.herancaAnimal;

public class Coelho extends Mamifero {

	public Coelho(String nome, String raca, int idade) {
		super(nome, raca, idade, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O Coelho bate os pés.\n");
	}

	@Override
	public void amamentar() {
		System.out.println(getRaca() + " pode amamenta.\n");
	}
}
