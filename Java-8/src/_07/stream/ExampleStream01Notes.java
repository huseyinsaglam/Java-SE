package _07.stream;

public class ExampleStream01Notes {

}

// Stream buyuk data larý , verileri , dosyalarý stream hale getirip islememizi saglar
// Stream ler 3 ana bölümden olusur..
// 1. Bolüm = Source => Stream leri nasýl olusturuyoruz.. Arrays.stream, InStream.range
// 2. Bolüm = intermediate operations => stream leri dönüþtüme iþlemleri yapar.. map,filter,peek,distinct,sorted
// 3. Bolüm = Terminal operations => Stream lerin sonuca baglandýgý yerdir. sum,foreach,collection
// NOT = intermediate operations stream leri sonuca baglamaz.. Sonuca baglayabilmesi icin
// Terminal operations kullanmak zorundadýr. ve en fazla bir tane bir stream üzerinde Terminal operations kullanabiliriz.
// yani Terminal operations olmazsa yazdýklarýmýz Source , intermediate operations calismaz