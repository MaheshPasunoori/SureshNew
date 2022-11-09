package in.ineuron.main;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZy DOG";
				s1=s1.replace(" ","").toLowerCase();
				int i =97;
				boolean flag = true;
				for(int j=0;j < 26; j++ ) {
					
					char c = (char)i;
					if(!s1.contains(c+"")) {
						System.out.println("Missing Character is " + c);
				    	flag=false;
				    	break;
				    }
				    	i++;
				}
				if(flag) System.out.println("It's pangram"); else System.out.println("It's Not Pangram");

				 System.out.println("Suresh");
				 System.out.println("Suresh");
				 System.out.println("Suresh");
				 
	}

}
