package Poo.herancaVeiculo;

public class Carro extends Veiculo {
	
	private final int quantidaDePortas;
	
	public Carro(String marca, String modelo, String ano, int quantidaDePortas) {
		super(marca, modelo, ano);
		// TODO Auto-generated constructor stub
		 this.quantidaDePortas =  quantidaDePortas;
	}
	@Override
	public void exibirInfor() {
        System.out.println("Este carro é um "+ getMarca()+", modelo: "+getModelo()+ " ano: "+ getAno()+" e é "+getQuantidaDePortas()+" Portas");
    }
	
	public int getQuantidaDePortas() {
		return quantidaDePortas;
	}
	
	
}
