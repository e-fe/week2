package week2;



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
import java.lang.Math;

public class  Mat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Karesini almak istediğiniz değeri giriniz : ");
        int x = input.nextInt();
        double a = (int) Math.pow(x, 2);
        System.out.println("değer : " + a);
    }

}
    

