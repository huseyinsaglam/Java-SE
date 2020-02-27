package example;


import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        String[] kanallar = {"Radyo Viva","Radyo Fenomen","Kral Pop","Radyo Hacettepe","Alem FM"};
        
        Radyo radyo =  new Radyo(kanallar);
        
        Radyo2 radyo2 =  new Radyo2(kanallar);
        
        for (String s : radyo ) {
            System.out.println(s);
            
        }
        
        
        
        Iterator<String> iterator =  radyo2.iterator();
        
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next());
            
        }
       
        
    }
}
