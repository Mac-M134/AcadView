import java.util.Scanner;
class leapyear{
    public static void main(String args[]){
	int a;
	Scanner ad=new Scanner(System.in);
	a=ad.nextInt();
	if((a%4==0&&a%100!=0)||a%400==0){
		System.out.print("Year is a leap year");
	}
	else{ 
		System.out.print("Year is not a leap year");
	}
    }
    
}



