package Entities;

import Interface.GeometricShapes;

public class Square implements GeometricShapes{
	
	private int lado;
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}
	
	
}
