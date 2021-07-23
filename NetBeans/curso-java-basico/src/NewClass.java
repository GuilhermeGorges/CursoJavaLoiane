
import java.util.Scanner;


public class NewClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x;
        int count = 0;
        for (int i = 0; i < 6; i++){
            x = scan.next();
            int y = Integer.parseInt(x);
            if (y > 0){
                count++;
            }
            
        }
        System.out.println(count);
        
    }
}
