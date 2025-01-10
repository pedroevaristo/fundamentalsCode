package Poo.herancaAnimal;

public class Ave extends Animal {

	private final Boolean voar;
	private final String tipoDePena;

	public Ave(String nome, String raca, int idade, String tipoDePena) {
		super(nome, raca, idade);
		this.voar = !raca.toLowerCase().contains("pinguim");
		this.tipoDePena = tipoDePena;
		
		// TODO Auto-generated constructor stub
	}

	
	public void voar() {
		if(getRaca().toLowerCase().contains("papagaio")) {
			
			System.out.println((getVoar() ?"Sim ": "Não" )+" pode voar");
			
		}else if(getRaca().toLowerCase().contains("pinguim")) {
			
			System.out.println((getVoar() ?"Sim" : "Não" )+" pode voar");
			
		}
	}
	

	public Boolean getVoar() {
		return voar;
	}

	public String getTipoDePena() {
		return tipoDePena;
	}
	
	
}
