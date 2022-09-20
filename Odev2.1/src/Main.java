
public class Main {

	public static void main(String[] args) {
		
//------------> On birinci ders: ReCap Demo 2
				double[] myList = {1.2,6.3,4.3,5.6};
				double total=0;
				double max=myList[0];
				
				for(double number:myList)
				{
					if(max<number) max=number;
					
					total=total+number;
					System.out.println(number);
				}
				System.out.println("Toplam = "+total);
				System.out.println("En Büyük = "+max);
				
				System.out.println("*****************");
//------------> On ikinci ders: Çok boyutlu diziler
				String[][] sehirler= new String[3][3];
				sehirler[0][0]="İstanbul";
				sehirler[0][1]="Bursa";
				sehirler[0][2]="Bilecik";
				sehirler[1][0]="Ankara";
				sehirler[1][1]="Konya";
				sehirler[1][2]="Kayseri";
				sehirler[2][0]="Diyarbakır";
				sehirler[2][1]="Şanlırfa";
				sehirler[2][2]="Gaziantep";
				//satırları gezecek döngü içerisinde sütun gezecek döngü
				for(int i=0;i<=2;i++) {
					System.out.println("------------");
					for(int j=0;j<=2;j++) {
						System.out.println(sehirler[i][j]);
					}
				}
				
				System.out.println("*****************");
//------------> On üçüncü ders: Stringler
				String mesaj="Bugün hava çok güzel.";
				System.out.println(mesaj);
				System.out.println("Eleman sayısı: "+ mesaj.length());
				System.out.println("5. Eleman: "+ mesaj.charAt(4));
				System.out.println(mesaj.concat(" Yaşasın!")); //Geçici olarak yeni metin oluşturur
				System.out.println(mesaj.startsWith("B"));//İlk harf koşulu
				System.out.println(mesaj.endsWith("."));
				
				char[] karakterler=new char[5];
				mesaj.getChars(0, 5, karakterler, 0);
				System.out.println(karakterler);
				System.out.println(mesaj.indexOf('a'));
				System.out.println(mesaj.lastIndexOf('e'));//aramaya sağdan başlar
				
				System.out.println("*****************");
//------------> On dördüncü ders: Stringler	2
				String mesaj2="Bugün hava çok güzel.";
				System.out.println(mesaj2);
				
				
				String yeniMesaj=mesaj2.replace(' ', '-');
				System.out.println(yeniMesaj);
				System.out.println(mesaj2.substring(2,5));
				
				System.out.println("---");
				for(String kelime:mesaj2.split(" "))
				{System.out.println(kelime);}
				
				System.out.println(mesaj2.toLowerCase());
				System.out.println(mesaj2.toUpperCase());
				System.out.println(mesaj2.trim());//Metnin başındaki ve sonundaki boşlukları sileriz
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
