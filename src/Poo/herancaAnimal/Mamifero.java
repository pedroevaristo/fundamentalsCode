package Poo.herancaAnimal;

public class Mamifero extends Animal {
	private final boolean temPelos;
	
	public Mamifero(String nome, String raca, int idade) {
		super(nome, raca, idade);
		// TODO Auto-generated constructor stub
	}
	
	public void amamentar() {
		System.out.println("Este mamifero pode amamenta.");
	}
}
