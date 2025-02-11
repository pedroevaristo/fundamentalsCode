package Poo.herancaAnimal;

public class Mamifero extends Animal {
	private final boolean temPelos;

	public Mamifero(String nome, String raca, int idade, boolean temPelos) {
		super(nome, raca, idade);
		this.temPelos = temPelos;
		// TODO Auto-generated constructor stub
	}

	public boolean isTemPelos() {
		return temPelos;// Getter para processar o atributo
	}

	public void amamentar() {
		System.out.println("Este mamifero pode amamentar.");
	}

}
