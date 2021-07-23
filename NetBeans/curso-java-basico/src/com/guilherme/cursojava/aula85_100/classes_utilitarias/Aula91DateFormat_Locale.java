package com.guilherme.cursojava.aula85_100.classes_utilitarias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat_Locale {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(Locale.getDefault()); // verificar padrao de idoma

        String hojeFormatado = DateFormat.getInstance().format(hoje); // formatando a data
        System.out.println(hojeFormatado);

        Locale.setDefault(new Locale("en", "US")); // mudando para o padrão americano 

        hojeFormatado = DateFormat.getInstance().format(hoje);// formatando a data
        System.out.println(hojeFormatado);

        Locale.setDefault(new Locale("pt", "BR")); // mudando para o padrão br
        
        hojeFormatado = DateFormat.getTimeInstance().format(hoje); // formatando a hora 
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance().format(hoje); // formatando a data
        System.out.println(hojeFormatado); //dd/MMM/yyyy

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje); // formatação data + hora
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);// SHORT hour format
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje); // MEDIUM hour format
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje); // LONG hour format
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance( // SHORT date/hour format
                DateFormat.SHORT, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        String data = "12-02-2017 14:25";
        try {
            Date dataDate = DateFormat.getInstance().parse(data);
            System.out.println(dataDate);

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataDate);

            System.out.println(calendario);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
