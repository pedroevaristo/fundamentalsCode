package Poo.herancaAnimal;

public class Ave extends Animal {//aqui é como eu tinha feito na primeira vez antes de pergunta se estaria certo de ser utilizado desta forma

	private final Boolean voar;
	private final String tipoDePena;

	public Ave(String nome, String raca, int idade, String tipoDePena) {
		super(nome, raca, idade);
		this.voar = !raca.toLowerCase().contains("pinguim");
		this.tipoDePena = tipoDePena;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		if (getRaca().toLowerCase().contains("papagaio")) {
			System.out.println("Papagaio fica cantando ou falando demais \n");
		} else {
			System.out.println("O pinguim ... o som parece de um chewbacca \n");
		}
	}

	@Override
	public void mover() {
		System.out.println("Esta ave voa para se mover. \n");
	}

	
	public void voar() {
		if (getRaca().toLowerCase().contains("papagaio")) {

			System.out.println(getRaca()+" "+"pode"+(getVoar() ? " sim " : "não")+" voar");

		} else if (getRaca().toLowerCase().contains("pinguim")) {

			System.out.println(getRaca()+" "+"pode"+(getVoar() ? " sim " : "não")+" voar");

		}
	}

	
	public Boolean getVoar() {
		return voar;
	}

	public String getTipoDePena() {
		return tipoDePena;
	}

}
