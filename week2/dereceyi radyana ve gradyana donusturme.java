//1)kullanıcıdan dereceyi al
//2)dereceyi radyana ve gradyana çevir
//3)kullanıcıya geri ver
package week2;

import java.util.Scanner;

/**
 *
 * @author mehme
 */
public class hw2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dereceyi giriniz");
        double pi = 3.14;
        double x = input.nextDouble();
        double radyan = x * pi / 180;
        System.out.println(radyan + " radyan");
        double gradyan = x * 10 / 9;
        System.out.println(gradyan + " gradyan");
        
        
        
    
    }

}
