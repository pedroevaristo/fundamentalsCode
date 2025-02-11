package Poo.herancaAnimal;

import java.util.List;

import java.util.ArrayList;

public class HerancaAnimal {
	public static void main(String[] args) {
		
		//listas
		List<Animal> animals = new ArrayList<Animal>();
		
		List<Aves> aves = new ArrayList<Aves>();
		
		
		Cachorro dog = new Cachorro("Oswaldo", "Caramelo", 3);
		Gato cat = new Gato("Billy", "Havana", 5);
		Coelho bunny = new Coelho("Stitch", "Coelho-europeu", 2);// String nome, String raca, int idade
		Papagaio bird = new Papagaio("Luna", "Papagaio-Charão", 2, "Coloridas");// String nome, String raca, int idade, Boolean
																		// voar, String tipoDePena
		Pinguim pinguim = new Pinguim("Hapy", "Pinguim-de-magalhães ", 2, "Impermeavéis");
		Cavalo horse = new Cavalo("Dora", "Quarto de milha", 10);
		
		
		
		/*// emitirSom
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
		bird.mover();*/

		// testar o nível 3 de herança + polimorfismo
		System.out.println(dog.getNome() + " tem pelos ? " + dog.isTemPelos());
		dog.amamentar();
		bunny.amamentar();
		
		//lista de todos os animais
		aves.add(pinguim);
		aves.add(bird);
		
		for(Aves ave: aves) {
			System.out.println("Esta ave " + ave.getNome() +" Desta raça "+ ave.getRaca()+" ela se movimenta :");
			ave.voar();
		}
		
		animals.add(dog);
		animals.add(cat);
		animals.add(bunny);
		animals.add(bird);
		animals.add(pinguim);
		animals.add(horse);
		
		for (Animal animal : animals) {
			System.out.println("Este animal " + animal.getNome() +" Desta raça "+ animal.getRaca()+" ela se movimenta :");
			animal.mover();
			animal.emitirSom();
		}
		
		// colocar uma lista com loop for para mostrar as informações

	}
}
