package Poo.herancaAnimal;

public class HerancaAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Oswaldo", "Caramelo", 3);
		Gato cat = new Gato("Billy", "Havana", 5);
		Coelho bunny = new Coelho("Stitch", "Coelho-europeu", 2);// String nome, String raca, int idade
		Ave bird = new Ave("Luna", "Papagaio-Charão", 2, "Coloridas");// String nome, String raca, int idade, Boolean
																		// voar, String tipoDePena
		Ave pinguim = new Ave("Hapy", "Pinguim-de-magalhães ", 2, "Impermeavéis");
		Cavalo horse = new Cavalo("Dora", "Quarto de milha", 10);

		// emitirSom
		dog.emitirSom();
		cat.emitirSom();
		bird.emitirSom();
		horse.emitirSom();

		// Voar
		bird.voar();
		pinguim.voar();
		// Mover
		horse.mover();
		cat.mover();
		dog.mover();
		bird.mover();

		// testar o nível 3 de herança + polimorfismo
		System.out.println(dog.getNome() + " tem pelos ? " + dog.isTemPelos());
		dog.amamentar();
		bunny.amamentar();
		
		// colocar uma lista com loop for para mostrar as informações
	}
}
