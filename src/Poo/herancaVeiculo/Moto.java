package Poo.herancaVeiculo;

public class Moto extends Veiculo{
	private final String tipoDoGuidom;
	
	public Moto(String marca, String modelo, String ano, String tipoDoGuidom) {
        super(marca, modelo, ano);
        this.tipoDoGuidom = tipoDoGuidom;
    }
	
	public void exibirInfor() {
		System.out.println("Esta moto é da marca "+getMarca()+", modelo "+getModelo()+" do ano "+getAno()+" e possui um estilo de guidão "+getTipoDoGuidom());
	}
	
	public String getTipoDoGuidom() {
		return tipoDoGuidom;
	}
	
	
}
