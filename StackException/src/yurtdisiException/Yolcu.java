package yurtdisiException;


import java.util.Scanner;
class SiyasiException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi Yasaginiz Bulunuyor...");

    }
  
}
class VizeException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Gideceginiz Vizeniz Bulunmamaktadir...");
    }
  
    
}
class HarcException extends Exception {

    @Override
    public void printStackTrace() {

        System.out.println("Lutfen yurtdisi harciniz tam yatirin...");
    }
    
    
    
}

public class Yolcu{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatiracaginiz Harc Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Herhangi bir siyasi yasaginiz bulunuyor mu(evet ya da hayir) ? ");
        
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            
            this.siyasiYasak = true;
        } 
        else {
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayir)");
        
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("evet") ){
            this.vizeDurumu = true;
            
        }
        else {
            this.vizeDurumu = false;
        }
        
        
        
        
        
    }

    
    public void yurtdisiHarciKontrol() throws HarcException {
        if (this.harc < 15) {
            
           throw new HarcException();
           
        }
        else {
            System.out.println("Yurtdisi harci islemi tamam!");
          
        }
    }

    
    public void siyasiYasakKontrol() throws SiyasiException {
        
        if (this.siyasiYasak == true) {
            throw new SiyasiException();
            
           
        }
        else {
            System.out.println("Siyasi yasaginiz bulunmuyor...");
           
        }
    }

    
    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu == true) {
            System.out.println("Vize islemleri tamam!");
            
        }
        else {
            throw new VizeException();
            
            
        }

    }
    
    
}
