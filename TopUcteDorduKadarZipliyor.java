package DoWhileLoop;

import java.util.Scanner;

public class TopUcteDorduKadarZipliyor {

    //Bir top belirli bir yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Topun birakildigi yuksekligi giriniz: ");
    	
    	double ilkyukseklik = scan.nextDouble();
    	
    	double ilk =ilkyukseklik;
    	
    	int vurmasayisi=0;
    	
    	double Mesafe= 0;
    	
    
    	
    	
    	
    		
    		if (ilkyukseklik*0.75<1.0) {
    	System.out.println("Top bir kez yere vurdu, gittigi mesafe: "+ilkyukseklik*1.75);
    			
    		}else {
    			do {
    				ilkyukseklik= 0.75*ilkyukseklik;
            		Mesafe+= 2*ilkyukseklik;
            		
            		vurmasayisi++;
				} while (!(ilkyukseklik*0.75<1.0));
    			
    			
    			System.out.println("Topun gittigi mesafe :"+ (Mesafe+ilk));
        		System.out.println(vurmasayisi);
        		
    				
        		} 
            	
            	scan.close();	
            	
        			
				}
    			
    			
    			
    		}
    		
    	
    	
    	
    	


    

