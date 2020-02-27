package app;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Kumanda{
    
    private ArrayList<String> kanallar = new ArrayList<String>();
        
    public void kanalEkle(String kanal) {
        
        kanallar.add(kanal);
        
    }
    
    public void kanal_goster()
    {
    	ListIterator<String> itr = kanallar.listIterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    }
    
    public void kanalSil(String kanal) {
        if (kanallar.contains(kanal)) {
            kanallar.remove(kanal);
            
        }
        else {
            System.out.println("Boyle bir kanal bulunmuyor...");
        }
        
    }
    public int kanalSayisi() {
        
        return kanallar.size();
        
    }

}
