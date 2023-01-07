//1)kullanıcıdan taban uznulugunu ve yukseklıgı al
//2)taban uzunlugnu ve uzunlugu çarp 
//3)kullanıcıya geri ver
package week2;

import java.util.Scanner;

/**
 *
 * @author mehme
 */
public class hw1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("tabanı giriniz");
        int taban = input.nextInt();
        System.out.println("yüksekliği giriniz");
        int h = input.nextInt();
        int alan= taban*h/2;
        System.out.println("alan : "+alan);
        
        
    }
    
}
