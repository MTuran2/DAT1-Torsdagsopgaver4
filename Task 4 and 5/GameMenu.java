import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
		
		Scanner scan = new Scanner(System.in);

		private ArrayList<String> actions = new ArrayList<>();
		GameMenu(ArrayList<String> arr){
			arr = actions;
		}
		public void displayMenu (ArrayList<String> arr){
			for (String s : arr){
			System.out.println(s);
			}
		}
		


		
		public String getAction (ArrayList<String> arr){
			System.out.println("Type a number to choose an action");
			for (String s : arr){
			System.out.println(s);
			}
			String choice = scan.nextLine();
			return choice;
		}
	}
