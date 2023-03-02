import java.util.Scanner;

public class Main{
	
	static int retire = 67;

	public static void main (String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.println("Please type your name");
		String name = scan.nextLine();
		System.out.println("Hello " + name + ", please type your age");
		int age = scan.nextInt();
		System.out.println("Your name is " + name + " and you are " + age + " years old");
		getRetirement(age);
		System.out.println("You will retire in " + retire + " years");

	}
	public static int getRetirement(int i){
		if(i < retire){
		retire -= i;
		return retire;
		}
		else{
			retire -= retire;
			return retire;
		}
	}
}
