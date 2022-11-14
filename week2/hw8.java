//1)kullanıcıdan btc eth xrp ve doge mıktarlarını alıyoruz
//2)degerlerini hesaplayıp kullanıcıya geri veriyoruz
package week2;

/**
 *
 * @author mehme
 */
    import java.util.Scanner;
public class hw8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bitcoin miktarınız:");
        double btc = input.nextDouble();
        System.out.println("Etherium miktarınız:");
        double eth = input.nextDouble();
        System.out.println("Ripple miktarınız:");
        double xrp= input.nextDouble();
        System.out.println("Doge miktarınız");
        double doge= input.nextDouble();
        double btcd = btc*19.135;
        double ethd = eth*1.297;
        double xrpd = xrp*0.44971;
        double doged = doge*0.059;
        System.out.println("bitcoin ederi : "+ btcd);
        System.out.println("etherium ederi : "+ ethd);
        System.out.println("ripple ederi : "+ xrpd);
        System.out.println("doge ederi : "+ doged);
       
        
        
        
    }
    
}
