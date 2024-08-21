package entity;

import repository.Veiculo;

public class UnoQuadrado implements Veiculo{
	private String cor;
	private String ano;
	
	public UnoQuadrado() {}
	
	public UnoQuadrado(String cor, String ano) {
		this.cor = cor;
		this.ano = ano;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	@Override
	public void ligar() {
		System.out.println("Está ligado");
		
	}
	@Override
	public void desligar() {
		System.out.println("Está desligado");
	}
	
	@Override
	public void buzinar() {
		System.out.println("PI-BIT PI-BIT");
	}
	
	@Override
	public String toString() {
		return 	"cor: " + cor + ", "
				+"ano: " + ano;
				
	}
	
	
}
