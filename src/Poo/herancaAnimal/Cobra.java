package Poo.herancaAnimal;

public class Cobra extends Animal{
	
	public String tipoDeEscama;
	public Reptil reptil;
	
	public Cobra(String nome, String raca, int idade, String tipoDeEscama) {
		super(nome, raca, idade);
		
		this.tipoDeEscama = tipoDeEscama;
		// TODO Auto-generated constructor stub
	}
	
	public void trocarDePele() {
		reptil.trocarPele();
	}
	
	
	@Override
	public void mover() {
		System.out.println("A cobra rastejar.");
	}
	

}
