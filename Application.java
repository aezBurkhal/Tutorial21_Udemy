
public class Application {
	public static void main(String[] args) {
		// inefficient
		String info = "";

		info += "My name is Bob,";
		info += " ";
		info += "I am a builder.";

		System.out.println(info);

		StringBuilder sb = new StringBuilder("");

		sb.append("My name is sue,");
		sb.append(" ");
		sb.append("I am a lion tamer.");

		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder();

		s.append("My name is Roger.");
		s.append("I am a sky diver.");

		System.out.println(s.toString());

		// Formatting////////////////////////
		

		System.out.println("Here is some text.\tThat was a tab.\nThat was a newline");
		System.out.println("More text.");
		
		//formatting integers
		System.out.printf("Total cost 5; quantity is %d\n", 120);
		
		for(int i=0; i<20; i++) {
			System.out.printf("%-2d: %s\n", 1, "here is some text");
		}
	
			// formatting floating point values
			System.out.printf("Total value: %.2f\n", 5.4876);
			System.out.printf("Total value: 5235.4876 ");
		}

	}


