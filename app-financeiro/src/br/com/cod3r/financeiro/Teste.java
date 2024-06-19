package br.com.cod3r.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {
public static void main(String[] args) {
	Calculadora cal  = ServiceLoader.load(Calculadora.class).findFirst().get();
	//System.out.print(Calculadora.class.getDeclaredFields()[0].getName());
	System.out.print(cal.soma(2,2));
	
	try {
		Field fieldId = cal.getClass().getDeclaredFields()[0];
		fieldId.setAccessible(true);
		fieldId.set(cal, "adc");
		System.out.print(cal.getId());
		fieldId.setAccessible(false);
	}catch(Exception e) {
		e.getStackTrace();
	}
	
	
	 
	
}
}
 