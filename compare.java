import java.util.Scanner;
class compare{
            public static void main(String args[]){
                int a,b,c,largest;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter 1st-no: ");
                a=sc.nextInt();
                System.out.print("Enter 2nd-no: ");
                b=sc.nextInt();
                System.out.print("Enter 3rd-no: ");
                c=sc.nextInt();
                largest=(a>b?(a>c?a:c):(b>c?b:c));
                System.out.print("Largest No is: "+largest);
            }
}