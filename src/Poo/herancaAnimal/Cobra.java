package Poo.herancaAnimal;

public class Cobra extends Reptil{

	public Cobra(String nome, String raca, int idade, String tipoDeEscama) {
		super(nome, raca, idade, tipoDeEscama);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void mover() {
		System.out.println("A cobra rastejar.");
	}

}
