import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
//------------>//İlk ders; metin çıktısı
		System.out.println("Merhaba Java");
		
		System.out.println("*****************");
//------------>//İkinci ders; değişkenler ve kullanımı
		int ogrenciSayisi=12;
		String mesaj="Öğrenci sayısı: ";
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println("Öğrenci sayımız: "+ogrenciSayisi);
		
		System.out.println("*****************");
//------------>//Üçüncü ders; Temel veri tipleri
		double sayi=12.5;
		sayi=129;
		
		char karakter='Z';
		
		boolean dogruMu=true;
		
		System.out.println("*****************");
//------------>//Dördüncü ders; If Blokları
		int sayi1=24;
		if(sayi1<20) System.out.println("Sayı 20'den küçüktür");
		else if(sayi1==20)System.out.println("Sayı 20'ye eşittir");
		else System.out.println("Sayı 20'den büyüktür");
		
		System.out.println("*****************");
//------------>//Beşinci ders; ReCap Demo
		int s1=24;
		int s2=25;
		int s3=26;
		int enBuyuk=s1;
		
		if(enBuyuk<s2)enBuyuk=s2;
		if(enBuyuk<s3)enBuyuk=s3;
		System.out.println("En büyük = "+enBuyuk);
		
		System.out.println("*****************");
//------------>//Altıncı ders; Switch Blokları
		char grade='A';
		
		switch (grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok güzel : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Maalesef kaldınız!");
				break;
			case 'F':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			default:
				System.out.println("Geçersiz harf girdiniz");
		}
		
		System.out.println("*****************");
//------------>Yedinci ders; For Döngüsü
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i); //1-10 arası tek sayılar
		}
		
		System.out.println("Döngü Bitti");
		
//------------>Sekizinci ders; While Döngüsü
		int i=2;
		while(i<10) {
			System.out.println(i);//10'a kadar olan çift sayılar
			i+=2;
		}
		
		System.out.println("While Döngüsü Bitti");
		
//------------>Dokuzuncu ders; Do-While Döngüsü
		int j=100;
		do{
			System.out.println("Loglandı");
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
		
//------------>Onuncu ders; Diziler
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("------------------------");
		
		String[] ogrenciler= new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		
		for (int k = 0; k < ogrenciler.length; k++) {
			System.out.println(ogrenciler[i]);
		}
		//Diğer yaygın yöntem 
		//for(String ogrenci:ogrenciler){System.out.println(ogrenci);}
		
	}

}
