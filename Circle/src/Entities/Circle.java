package Entities;

import Interface.GeometricShapes;

public class Circle implements GeometricShapes{
	private int raio;

	public Circle(int raio) {
		super();
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() 
	{
		return Math.PI * Math.pow(raio, 2);
	}
	
	public int getRaio() 
	{
		return raio;
	}

	public void setRaio(int raio) 
	{
		this.raio = raio;
	}

	
	
}
