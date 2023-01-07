//1)kullanıcıdan kürenin yarıçapını al
//2)yarıçapla birlikte alanı ve hacmi hesapla
//3)kullanıcıya geri ver
package week2;

import java.util.Scanner;

/**
 *
 * @author mehme
 */
public class hw3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kürenin yaricapını yazınız ");
        int r = input.nextInt();
        //double pi = 3.14;
        double alan = (double)  4*Math.PI*Math.pow(r,2);
        double hacim = 4/3*Math.PI*Math.pow(r,3);
        System.out.println("alan : "+alan);
        System.out.println("hacim : "+hacim);
        
        
        
        
        
    

    }

}
