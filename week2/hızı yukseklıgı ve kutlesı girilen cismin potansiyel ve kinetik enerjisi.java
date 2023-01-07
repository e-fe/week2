//1)kullanıcıdan cismin hızını kütlesini ve yüksekliğini al
//2)değerleri kullanarak kinetik ve potansiyel enerjiyi bulduk
//3)kullanıcıya geri verdik
package week2;

/**
 *
 * @author mehme
 */
import java.util.Scanner;

public class hw4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cismin hızı");
        double V = input.nextDouble();
        System.out.println("cismin kütlesi");
        double m = input.nextDouble();
        System.out.println("cismin yerden yüksekliği");
        int g = 10;
        double h = input.nextDouble();
        double ke = (double) 1/2*m*Math.pow(V,2);
        double pe = (double) m*g*h;
        System.out.println("ke : "+ ke);
        System.out.println("pe : "+ pe);
        
        
        

    }

}
