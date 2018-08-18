import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		int a,i;
		Scanner md=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		a=md.nextInt();
		boolean b=false;
		if(a<=2){
			System.out.print("Number is Prime");
		}
		else{
			for(i=2;i<a;i++){
			if(a%i==0){
				b=false;
				break;
			}
		b=true;
		}
			
		if(b==true)
			System.out.print("Numbr is Prime");
		else
			System.out.print("Number is not Prime");
		
	}
}

}



