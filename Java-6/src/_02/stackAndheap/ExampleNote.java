package _02.stackAndheap;

public class ExampleNote {

}
// Stack ve Heap Kavrami  => http://blog.bilgiyazan.com.tr/stack-ve-heap-kavrami/ 
// Bu iki veri tipi belle�in stack ve heap adl� b�lgelerini kullan�r. 
//  Primitif tip yani De�er tipleri (int, short, byte, long, decimal, double, float )
// Stack�te tutulurken referans tipleri Heap b�lgesinde tutulur. Stack Heap�e g�re daha h�zl�d�r.

// STACK
// Program�m�z�n i�erisindeki basit bir tamsay� t�r�nden nesnenin �al��ma zaman�nda y�klendi�i yer RAM�in Stack dedi�imiz b�lgesidir.
// HEAP
// Heap�te stack b�lgesi gibi RAM�deki haf�za alan�d�r. 
// Nesnelerin , Objelerin hepsi Heap�te bulunur ve veriler �al��ma zaman�nda dinamik olarak yarat�l�rlar yani derleme a�amas�nda yer tahsis i�lemi yap�lmaz.
// Referans tipli de�i�kenlerin sakland�klar� ve de�i�kene adres bilgisinin g�nderildi�i yerlerdir.

// NOT 1 => Stack�te yer alan veriler direk bellek i�ine yerle�tirilir dolay�s�yla eri�imi �ok h�zl�d�r
// ve program�n derleme a�amas�nda belle�e yerle�irler.
// Heap ise runtime(�al��ma zaman�nda) an�nda kullan�l�rlar ve 
// da��n�k bir bellek g�z yap�s� oldu�u i�in eri�imi stack kadar kolay olmaz dolay�s�yla yava� �al���r

// NOT 2 => Stack bellekteki veri hemen silinirken Heap bellekteki verinin silinmesi Garbage Collector�a (��p toplama mekanizmas�na) ba�l�d�r.