package yurtdisiException;


import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gokcen Havalimanina Hosgeldiniz....");
        
        String sartlar = "Yurtdisi cikis Kurallari...\n"
                         +"Herhangi bir siyasi yasaginiz bulunmamasi gerekiyor...\n"
                         +"15 Tl harc bedelinizi tam olarak yatirmaniz gerekiyor...\n"
                         +"Gideceginiz ulkeye vizenizin bulunmasi gerekiyor...";
        String message = "Yurtdisi Sartlarindan hepsini saglamaniz gerekiyor";
        
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harc Bedeli Kontrol Ediliyor...");
            
            Thread.sleep(3000);
            
            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
                
                
            }
            
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException ex) {
                ex.printStackTrace();
                continue;
                
            }
          
           
            
            
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException ex) {
               ex.printStackTrace();
               continue;
            }
            
            System.out.println("islemleriniz Tamam ! Yurtdisina cikabilirsiniz...");
            break;
            
            
        }
        
        
    }
}
