package br.com.coder3.app.calculo.interno;

import java.util.Arrays;

public class OperadoresArtimteticos {
	
	public double soma(double...nums) {
	 return Arrays.stream(nums).reduce(0.0,(t,v)->t+v);
	}
}
