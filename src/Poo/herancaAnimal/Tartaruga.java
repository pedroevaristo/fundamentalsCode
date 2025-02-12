package Poo.herancaAnimal;

public class Tartaruga extends Animal{ //Usar composição em veza de herança
	public final String tipoDeEscama;
	private Reptil reptil;
	
	public Tartaruga(String nome, String raca, int idade, String tipoDeEscama) {
		super(nome, raca, idade);
		this.tipoDeEscama = tipoDeEscama;
		// TODO Auto-generated constructor stub
	}
	
	public void trocarDePele() {
		reptil.trocarPele();
	}

	@Override
    public void mover() {
        System.out.println("A tartaruga anda devagar");
    }
}
