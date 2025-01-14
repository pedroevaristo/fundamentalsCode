package Poo.herancaAnimal;

public class HerancaAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Oswaldo","Caramelo",3);
		Gato cat = new Gato("Billy","Havana",5);
		Coelho bunny = new Coelho("Stitch","Coelho-europeu", 2);//String nome, String raca, int idade
		Ave bird = new Ave("Luna","Papagaio-Charão", 2,"Coloridas");//String nome, String raca, int idade, Boolean voar, String tipoDePena
		Ave pinguim = new Ave("Hapy","Pinguim-de-magalhães ", 2,"Impermeavéis");
		
		dog.emitirSom();
		cat.emitirSom();
		bird.emitirSom();
		
		
		bird.voar();
		pinguim.voar();
		
		//testar o nível 3 de herança + polimorfismo
		System.out.println(dog.getNome()+ "tem pelos ?" + dog.isTemPelos());
		dog.amamentar();
		
		bird.amamentar();
		//colocar uma lista com loop for para mostrar as informações
	}
}
