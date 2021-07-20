
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Teste {

    public static void main(String[] args) {

        /*
        Date data = new Date();
        SimpleDateFormat  formatter = new SimpleDateFormat("hh:MM:ss:mmm ");
        
        String dataFormatada = formatter.format(data);
        System.out.println(data);
        System.out.println(dataFormatada);
        */
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
