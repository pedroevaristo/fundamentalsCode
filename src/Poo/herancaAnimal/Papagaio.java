package Poo.herancaAnimal;

public class Papagaio extends Aves{

	public Papagaio(String nome, String raca, int idade, String tipoDePena) {
		super(nome, raca, idade, tipoDePena);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void voar() {
        System.out.println("O papagaio voa alto.");
    }
	
	@Override
	public void emitirSom() {
        System.out.println("O papagaio fala e repete as palavras.");
    }
	
	@Override
	public void mover() {
        System.out.println("O papagaio anda em velocidade constante.");
    }

}
