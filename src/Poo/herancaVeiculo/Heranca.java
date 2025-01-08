package Poo.herancaVeiculo;
//Sistema de veículos

public class Heranca {
	
	public static void main(String[] args) throws Exception {
		//Veiculo vech= new Veiculo("Chevrolet", "Silverado", "2023");
		//Veiculo anotherVec = new Veiculo("Dogde Ram","2500","2019");
		Carro car = new Carro("Chevrolet", "Silverado","2023", 4);
		Moto motocycle = new Moto("Suzuki","GX-r1000r","2021", "Esportivo");
		
		car.exibirInfor();
		
		motocycle.exibirInfor();
	}}

