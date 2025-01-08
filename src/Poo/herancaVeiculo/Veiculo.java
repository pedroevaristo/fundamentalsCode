package Poo.herancaVeiculo;

public class Veiculo {


	private final String marca;
	private final String modelo;
	private final String ano;
	
	public Veiculo(String marca, String modelo, String ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void exibirInfor() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAno() {
		return ano;
	}
	
}
