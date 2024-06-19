package br.com.cod3r.app.log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	public static void info(String msg) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.print("[INFO]"+ sdf.format(new Date()) + msg + " " );
		
	}

}
