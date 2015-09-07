import java.util.Scanner;


public class StringExercises {

	/**
	 * @param args
	 */
	public static boolean forgivingPrompt(String question)
	{
		System.out.println("The question is: " +question);	
		System.out.println("Enter the answer ");
		
		Scanner in = new Scanner(System.in);
		
		String Answer = in.nextLine();
		
		
		if ( Answer.equalsIgnoreCase("Y") || 
			 Answer.equalsIgnoreCase("Yes") ||
			 Answer.equalsIgnoreCase("Yep") ){
			return true;
		    } else if (Answer.equalsIgnoreCase("N") || 
				   Answer.equalsIgnoreCase("No") ||
			       Answer.equalsIgnoreCase("Nope")){
			return false;
			}
		    else {
		    	System.out.println ("Not a valid answer. " +
		    			"Please enter another one.");
		    	return forgivingPrompt(question);
		    }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String questionA = "Are you a CSC207 Student?";
		String questionB = "Are you a Grinnell College student?";
		String questionC = "Are you from America?";
		forgivingPrompt (questionA);
		forgivingPrompt (questionB);
		forgivingPrompt (questionC);
	}

}
