//1)kullanıcıdan aldıgı notu aldık
//2)aldıgı nota göre geçip geçmediğini kullanıcıya geri verdik
package week2;

/**
 *
 * @author mehme
 */
import java.util.Scanner;

public class hw7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("aldığınız not");
        String not = input.nextLine();
        switch (not) {
            case "A":
                System.out.println("Perfecto");
                break;
            case "B":
                System.out.println("Müko");
                break;
            case "C":
                System.out.println("İyi");
                break;
            case "D":
                System.out.println("Kötü");
                break;
            case "E":
                System.out.println("Çok Kötü");
                break;
            case "F":
                System.out.println("Ders Çalış Aq");
                break;
            default:
                System.out.println("Geçersiz Not Girdin Kanks");
                
            
        }
        
        

    }

}
