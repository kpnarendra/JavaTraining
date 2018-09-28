/**
 * 
 */
package firstPkg;

import java.io.StringReader;

/**
 * @author narendrakp
 *This class has print statements that will track the learning progress.
 *Each learning topic is listed here for tracking purpose.
 *Additional comments above each print statement will suggest the artifacts that relates to the topic 
 *and created during practice.
 */
public class HelloWorld {
	
	static int i=1;
	
	public static void main(String[] args) {
		
		PropertiesOfClass classProp = new PropertiesOfClass();
			
		System.out.println("Following subjects are covered so far.");
		System.out.println("\t " + i++ + " . " + "Java and JDK installation.");
		//The code is synchronised in Git hub path : https://github.com/kpnarendra/JavaTraining.git
		//Logged in from user : kpnarendra@aol.com
		System.out.println("\t " + i++ + " . " +"Github integration.");
		System.out.println("\t " + i++ + " . " + "Classes and methods");
		System.out.println("\t " + i++ + " . " + "Constructors");
		System.out.println("\n\n===================================================================================================================\n\n");
		
		 classProp.printProprtiesOfClass();
		
		 classProp.checkBox();
		
		
	}
	
}