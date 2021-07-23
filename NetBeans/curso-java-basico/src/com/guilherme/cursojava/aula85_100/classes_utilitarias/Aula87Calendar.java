package com.guilherme.cursojava.aula85_100.classes_utilitarias;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance(); //singleton

		int ano = today.get(Calendar.YEAR);
		int mes = today.get(Calendar.MONTH);
		int dia = today.get(Calendar.DAY_OF_MONTH);
		int hora = today.get(Calendar.HOUR_OF_DAY);
		int minutos = today.get(Calendar.MINUTE);
		int segundos = today.get(Calendar.SECOND);
		
		System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d", 
				dia, (mes+1), ano, hora, minutos, segundos);
		
		today.add(Calendar.DAY_OF_MONTH, -10);
		
		today.add(Calendar.DAY_OF_MONTH, 9);
		
		System.out.println();
		
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
                
                
	
	}


}
