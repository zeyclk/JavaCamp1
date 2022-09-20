
public class Main {

	public static void main(String[] args) {
		//Mükemmel sayı tüm pozitif bölenleri toplamı kendisine eşit olan
		//6=1,2,3 gibi
		
		int number=28;
		int total=0;
		
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
				total+=i;
		}
		
		if(total==number)
			System.out.println("Mükemmel sayıdır.");
		else
			System.out.println("Mükemmel sayı değildir.");
		
		

	}

}
