package _07.stream;

public class ExampleStream01Notes {

}

// Stream buyuk data lar� , verileri , dosyalar� stream hale getirip islememizi saglar
// Stream ler 3 ana b�l�mden olusur..
// 1. Bol�m = Source => Stream leri nas�l olusturuyoruz.. Arrays.stream, InStream.range
// 2. Bol�m = intermediate operations => stream leri d�n��t�me i�lemleri yapar.. map,filter,peek,distinct,sorted
// 3. Bol�m = Terminal operations => Stream lerin sonuca bagland�g� yerdir. sum,foreach,collection
// NOT = intermediate operations stream leri sonuca baglamaz.. Sonuca baglayabilmesi icin
// Terminal operations kullanmak zorundad�r. ve en fazla bir tane bir stream �zerinde Terminal operations kullanabiliriz.
// yani Terminal operations olmazsa yazd�klar�m�z Source , intermediate operations calismaz