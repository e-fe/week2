/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author mehme
 */
import java.util.Scanner;// JAVANIN UTİL KÜTÜPHANESİNE AİT SCANNER SINIFI

public class example1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen hesaplanmasini istediginiz km yi giriniz:");
        int km = input.nextInt(); //  KULLANICI KM Sİ ALINDI
        int m = km * 1000; //   KM Yİ M YE ÇEVİRDİK
        System.out.println(m + "metre");

    }

}
