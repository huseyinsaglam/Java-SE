package idman_log;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) {
        // Idman Olusturma Programi
    	  Scanner scanner = new Scanner(System.in);
          
          System.out.println("Idman Programina Hosgeldiniz...");
          
          String idmanlar = "Gecerli Hareketler...\n"
                            + "Burpee\n"
                            +"Pushup(Sirnav)\n"
                            +"Situp(Mekik)\n"
                            +"Squat";
          System.out.println(idmanlar);
          
          System.out.println("Bir idman olusturun...");
          
          System.out.print("Burpee Sayisi : ") ;
          int burpee = scanner.nextInt();
          System.out.print("Pushup Sayisi : ") ;
          int pushup = scanner.nextInt();
          System.out.print("Situp Sayisi : ") ;
          int situp = scanner.nextInt();
          System.out.print("Squat Sayisi : ") ;
          int squat = scanner.nextInt();
          
          scanner.nextLine();;
        
    
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("idmaniniz Basliyor.....");
        
        int i =  1;
        FileWriter writer = null;
        try {
        	new FileWriter("log.txt");
            writer.write("Idman Programi...\n");
            writer.write("Burpee Sayisi : " + idman.getBurpee_sayisi() + " \n");
            writer.write("Pushup Sayisi : " + idman.getPushup_sayisi()+ " \n");
            writer.write("Situp Sayisi : " + idman.getSitup_sayisi()+ " \n");
            writer.write("Squat Sayisi : " + idman.getSquat_sayisi()+ " \n");
           
          
            while (idman.idmanBittiMi() == false){
                
                System.out.print("Hareket Turu(Burpee,Pushup,Situp,Squat) : ");
                String tur = scanner.nextLine();
                System.out.print("Bu hareketten kac tane yapacaksiniz ? : ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                idman.hareketYap(tur, sayi);
                
                
                
            }
            System.out.println("Idmaninizi basariyla bitirdin....");
    
    
    }   catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
