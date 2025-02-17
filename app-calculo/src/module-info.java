import br.com.coder3.app.calculo.CalculadoraImpl;

module app.calculo {
	requires transitive app.logging;
	exports br.com.coder3.app.calculo;
	exports br.com.coder3.app.calculo.interno to app.financeiro ;
	
	opens br.com.coder3.app.calculo;
	
	requires app.api;	
	
	provides br.com.cod3r.app.Calculadora
	 with CalculadoraImpl;
}