package DoWhileLoop;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    	// STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        String systemPin = "javacanlara selam olsun";
        int girisHakki = 3;
        
        while (true) {
            System.out.print("pin code  giriniz : ");
            String userPin = scan.nextLine();
            if (userPin.equals(systemPin)) {
                System.out.println("gayet basarili");
                break;
            } else {
                System.out.println("hatali giris yapildi");
                girisHakki--;
                System.out.println("kalan deneme hakkiniz : " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("agam hakkin kalmadi bekleme yapma dewamkeee :)");
                   break;
                
            }
                
            }
            
        }
        
        System.out.println("break komutundan sonrasini gormek istedik, "
        		+ "break sadece while dongusunu kirar");
    }}
        	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	


