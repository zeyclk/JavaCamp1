import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int number=25;
		int reminder=number % 2;
		System.out.println(reminder);
		boolean isPrime=true; //isPrime asal olup olmadığını döndürür
		
		//Benim yaptığım
		/*
		if(number>1) {
			if(number==2||reminder==1) {
				System.out.println("Sayı asaldır.");
			}
			else System.out.println("Sayı asal değildir.");
		}
		else System.out.println("1 ve 0 asal değildir.");*/
		
		if(number==1) {
			System.out.println("Sayı asal değildir.");
			return;//uygulamaya burada son verir
		}
		
		if(number<1)System.out.println("Geçersiz sayı");
		
		for (int i = 2; i < number; i++) {
			if(number % i ==0) isPrime=false;
		}
		
		if(isPrime) {//isPrime==true ile aynı koşul
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}

	}

}
