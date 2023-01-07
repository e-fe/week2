//1)kullanıcıdan iletkenin direncini ve devreden geçen akımı aldık
//2)bu degerleri kullanarak devrenin gerilimini bulduk
//3)kullanıcıya geri verdik

package week2;

/**
 *
 * @author mehme
 */
import java.util.Scanner;

public class hw5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("iletkenin direnci");
        double R = input.nextDouble();
        System.out.println("iletkenin akımı");
        double i = input.nextDouble();
        double V = i*R ;
        System.out.println("direnç : "+V);
        
    }

}
