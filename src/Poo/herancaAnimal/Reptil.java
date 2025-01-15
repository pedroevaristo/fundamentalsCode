package Poo.herancaAnimal;

public class Reptil extends Animal {
	private final String tipoDeEscama;

	public Reptil(String nome, String raca, int idade, String tipoDeEscama) {
		super(nome, raca, idade);
		this.tipoDeEscama = tipoDeEscama;
		// TODO Auto-generated constructor stub
	}
	
	public void trocarPele() {
		System.out.println("O reptil trocou de pele.\n");
	}
	
	public void mover() {
		System.out.println("Este reptil se move.\n");
	}

}
