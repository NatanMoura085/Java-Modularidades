package br.com.coder3.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.log.Logger;
import br.com.coder3.app.calculo.interno.OperadoresArtimteticos;

public class CalculadoraImpl implements Calculadora{
	private String id = "AAA";
	 private OperadoresArtimteticos op = new OperadoresArtimteticos();

	public double soma(double... nums) {
		Logger.info("ola");
		return op.soma(nums);
	}
	 
	public String getId() {
		return id;
	}
	 

}
