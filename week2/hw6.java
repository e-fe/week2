//1)kullanıcıdan alacağı kredi miktarını alıyoruz
//2)kaç ay son ra odeyeceğını alıyoruz
//3)odeyeceğı aya göre faiz oranıyla çarpıuyrozu
//3)kullanıcıya geri veritoruz
package week2;

/**
 *
 * @author mehme
 */
import java.util.Scanner;

public class hw6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Çekmek istediğiniz para miktarı");
        double pm = input.nextDouble();
        System.out.println("kaç ayda ödemek istediğiniz");
        int ka = input.nextInt();
        if (ka <= 12) {
            double om = pm * 1.5;
            System.out.println("ödeyeceğiniz miktar : " + om);
        } else if (ka < 24) {
            double om = pm * 2;
            System.out.println("ödeyeceğiniz miktar : " + om);
        } else {
            double om = pm * 5;
            System.out.println("ödeyeceginiz miktar : " + om);
        }

    }
}
