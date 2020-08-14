package _03.gararbageCollector;

public class ExampleNotes {

}

// Herhangi bir program/application calistiginda kaynak tuketir.
// memory/ram ve cpu

// Operating System , bilgisayarimizda kaynaklari yonetmekten sorumludur.
// operating system ulke yoneticisi gibi dusunebiliriz.
// JVM e belli bir kaynak ayrilir.Stack bellekteki veri hemen silinirken
// Heap bellekteki verinin silinmesi Garbage Collector’a (Çöp toplama mekanizmasýna) baðlýdýr.
// Javada ise bu islem garbage collector tarafindan otomatik olarak yapilmaktadir.
// objeler icin kendimiz alan olusturup , alan bosaltmayiz. bu islemi javaya birakiriz.
// bu islem developerdan alindigi icin , memory-leak lere karsi onlem alinmis olur.
// bu ozellik Javanin Robust/guclu/direncli ozelligine katki saglar.
// C gibi pointerlarla ugrasmadigimiz icin , javanin Simple/basit ozelligini saglamaktadir.
// JVM , OS den memory allocate eder.
// bir objenin sahibi yoksa / erisen reference degisken yoksa bu noktada obje temizlenmeye/silinmeye uygun hale gelir.