package Poo.herancaAnimal;

public class Pinguim extends Aves{

	public Pinguim(String nome, String raca, int idade, String tipoDePena) {
		super(nome, raca, idade, tipoDePena);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void emitirSom() {
        System.out.println("Pinguim zinga \n");
    }
	@Override
    public void voar() {
        System.out.println("Pinguim não voa \n");
    }
	
	@Override
	public void mover() {
		System.out.println("O pinguim se move com asas.\n");
	}
}
