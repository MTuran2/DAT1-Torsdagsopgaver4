public class Main{

	public static void main (String[] args){

	Team t1 = new Team("De Uovervindelige"); 
	Team t2 = new Team("De Uimodståelige"); 
	Team t3 = new Team("De Frie"); 
	Team t4 = new Team("De Stærke");
	Team t5 = new Team("De Sidste");
	Team t6 = new Team("De Største");
	t1.setRank(3);
	t2.setRank(1);
	t3.setRank(4);
	t4.setRank(2);
	t5.setRank(6);
	t6.setRank(5);
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	System.out.println(t4);
	System.out.println(t5);
	System.out.println(t6);

	}
}

		
