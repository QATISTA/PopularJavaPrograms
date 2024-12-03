import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
char choice;
do {
	
System.out.println("Enter Year: ");
int x = sc.nextInt();
if ((x%4 ==0 && x%100!=0)|| x%400==0) {
	System.out.println("It's a leap year");

}
else {
	System.out.println("It's not a leap year");
}
	System.out.println("Do you want to ask again? (Y/N)");
	 choice = sc.next().charAt(0);

}
while (choice=='y'|| choice=='Y');
System.out.println("GOOD BYE !!");
	}

}
