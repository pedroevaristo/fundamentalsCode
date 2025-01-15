package Poo.herancaAnimal;

public class Tartaruga extends Reptil {

	public Tartaruga(String nome, String raca, int idade, String tipoDeEscama) {
		super(nome, raca, idade, tipoDeEscama);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void mover() {
		System.out.println("A tartaruga anda devagar");
	}

}
