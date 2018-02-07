import java.util.Scanner;
public class PhoneTest {
	public static void main(String[] args){
Phone phone1 = new Phone("Apple","iPhone 8",2017,700);
	System.out.println(phone1.Brand);
		System.out.println(phone1.PhoneName);
			System.out.println(phone1.yearReleased);
Phone phone2 = new Phone("Apple","iPhone 7",2016,600);
	System.out.println(phone2.Brand);		
		System.out.println(phone2.PhoneName);
			System.out.println(phone2.yearReleased);
Phone phone3 = new Phone("Apple","iPhone X",2017,1200);
	System.out.println(phone3.Brand);
		System.out.println(phone3.PhoneName);
			System.out.println(phone3.yearReleased);
Scanner scanner=new Scanner(System.in);
		System.out.println("Which phone would your like to buy: 1,2,or 3?");
	int choice=scanner.nextInt();
int Phone1=1;
int Phone2=2;
int Phone3=3;
if(choice==1){
	System.out.println(phone1.Price);
}
if(choice==2){
	System.out.println(phone2.Price);
}
if(choice==3){
	System.out.println(phone3.Price);
	}
}
}

	


