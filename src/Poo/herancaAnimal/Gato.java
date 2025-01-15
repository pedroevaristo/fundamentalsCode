package Poo.herancaAnimal;

public class Gato extends Mamifero {

	public Gato(String nome, String raca, int idade) {
		super(nome, raca, idade, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O gato mia.\n");
	}

	@Override
	public void amamentar() {
		System.out.println("O gato pode amamenta.\n");
	}

	@Override
	public void mover() {
		System.out.println("O gato engatinha.\n");
	}
}
