package idman;


import java.util.Scanner;



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
        
        scanner.nextLine();
        
    
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("idmaniniz Basliyor.....");
        
        
        while (idman.idmanBittiMi() == false){
            
            System.out.print("Hareket Turu(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kac tane yapacaksiniz ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
            
            
            
        }
        System.out.println("Idmaninizi basariyla bitirdin....");
    
    
    }
}
