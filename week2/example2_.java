/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
import java.util.Scanner;

public class example2_ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen hesaplanmasını istediginiz fh degeri giriniz:");
        double fah = input.nextDouble();
        double cs = (fah - 32) / 1.8;
        System.out.println("celcius degeri:" + cs);
    }
}
