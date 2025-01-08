package Poo.herancaAnimal;

public class Animal {
	private final String nome;
	private final int idade;
	private final String raca;//raça
	
	public Animal(String nome, String raca, int idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		
	}
	
	public void emitirSom() {
		System.out.println("Este Animal emiti som");
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
