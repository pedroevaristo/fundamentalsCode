package Poo.herancaAnimal;

public class Cavalo extends Mamifero {

	public Cavalo(String nome, String raca, int idade) {
		super(nome, raca, idade, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("Cavalo relincha \n");
	}

	@Override
	public void mover() {
		System.out.println("O cavalo galopa para se mover.\n");
	}

}
