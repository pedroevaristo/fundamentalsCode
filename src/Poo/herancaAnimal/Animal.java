package Poo.herancaAnimal;

public class Animal {
	private final String nome;
	private final int idade;
	protected final String raca;// raça

	public Animal(String nome, String raca, int idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;

	}

	public void emitirSom() {
		System.out.println("Este Animal emitir som");
	}

	public void voar() {
		System.out.println("Esta ave está voando");

	}

	public void mover() {
		System.out.println("Este animal se move");
	}

	protected void atualizarStatus() {
		System.out.println("Status do animal atualizado");
	}
	
	
	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public int getIdade() {
		return idade;
	}

}
