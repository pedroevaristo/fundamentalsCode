package Poo.herancaAnimal;

public class Gato extends Animal{

	public Gato(String nome, String raca, int idade) {
		super(nome, raca, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O gato mia. Característica Única");
	}
}
