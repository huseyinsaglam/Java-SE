package _02.stackAndheap;

public class ExampleNote {

}
// Stack ve Heap Kavrami  => http://blog.bilgiyazan.com.tr/stack-ve-heap-kavrami/ 
// Bu iki veri tipi belleðin stack ve heap adlý bölgelerini kullanýr. 
//  Primitif tip yani Deðer tipleri (int, short, byte, long, decimal, double, float )
// Stack’te tutulurken referans tipleri Heap bölgesinde tutulur. Stack Heap’e göre daha hýzlýdýr.

// STACK
// Programýmýzýn içerisindeki basit bir tamsayý türünden nesnenin çalýþma zamanýnda yüklendiði yer RAM’in Stack dediðimiz bölgesidir.
// HEAP
// Heap’te stack bölgesi gibi RAM’deki hafýza alanýdýr. 
// Nesnelerin , Objelerin hepsi Heap’te bulunur ve veriler çalýþma zamanýnda dinamik olarak yaratýlýrlar yani derleme aþamasýnda yer tahsis iþlemi yapýlmaz.
// Referans tipli deðiþkenlerin saklandýklarý ve deðiþkene adres bilgisinin gönderildiði yerlerdir.

// NOT 1 => Stack’te yer alan veriler direk bellek içine yerleþtirilir dolayýsýyla eriþimi çok hýzlýdýr
// ve programýn derleme aþamasýnda belleðe yerleþirler.
// Heap ise runtime(çalýþma zamanýnda) anýnda kullanýlýrlar ve 
// daðýnýk bir bellek göz yapýsý olduðu için eriþimi stack kadar kolay olmaz dolayýsýyla yavaþ çalýþýr

// NOT 2 => Stack bellekteki veri hemen silinirken Heap bellekteki verinin silinmesi Garbage Collector’a (Çöp toplama mekanizmasýna) baðlýdýr.