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
public class MainClass {
	
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
		
		 int mvar1 = 1, mvar2 = 2;
		 int mvar3 = 3, mvar4 = 4;
		 int mvar5 = 5;

		 
		 System.err.println("\n \nCALL BY VALUE (for primitive data types) AND CALL BY REFERENCE FOR OBJECTS (User defined classes and their Objects).");
		 
		System.out.println("\n\nmath version 1....."); 
		Test obj2 = new Test();
		System.out.println("Before math v1 using obj2 : "+" mvar3 = " + mvar3 + " mvar4 = " + 
				mvar4 + " obj2.var1 = " + obj2.var1 + " obj2.var2 = "  + obj2.var2);
		
		obj2.math(mvar3, mvar4);
		System.out.println("After math v1 using obj2 : "+" mvar3 = " + mvar3 + " mvar4 = " + 
				mvar4 + " obj2.var1 = " + obj2.var1 + " obj2.var2 = " + obj2.var2);
		System.out.println("\n\nmath version 1 AGAIN....."); 
		System.out.println("Before math v1 using obj2 : "+" mvar3 = " + mvar3 + " mvar4 = " + 
				mvar4 + " obj2.var1 = " + obj2.var1 + " obj2.var2 = "  + obj2.var2);
		
		obj2.math(mvar3, mvar4);
		System.out.println("After math v1 using obj2 : "+" mvar3 = " + mvar3 + " mvar4 = " + 
				mvar4 + " obj2.var1 = " + obj2.var1 + " obj2.var2 = " + obj2.var2);
		
		
		
		
		System.out.println("\n\nmath version 2....."); 
		Test obj1 = new Test(mvar1, mvar2);
		System.out.println("Before math v2 using obj1 : "+" mvar1 = " + mvar1 + " mvar2 = " + 
				mvar2 + " obj1.var1 = " + obj1.var1 + " obj1.var2 = " + obj1.var2);
		obj1.math(obj1);
		System.out.println("After math v2 using obj1 : "+" mvar1 = " + mvar1 + " mvar2 = " + 
				mvar2 + " obj1.var1 = " + obj1.var1 + " obj1.var2 = " + obj1.var2);
		System.out.println("\n\nmath version 2 - Again....."); 
		obj1.math(obj1);
		System.out.println("After math v2 using obj1 : "+" mvar1 = " + mvar1 + " mvar2 = " + 
				mvar2 + " obj1.var1 = " + obj1.var1 + " obj1.var2 = " + obj1.var2);
		System.out.println("\n\nHERE THE OBJECT IS USED AS A PARAMETER HENCE THE REFERENCE"
				+ " TO THE OBJECT IS SENT OBJ2 VALUES ARE ALREADY INCREMENTED BY 2, \n"
				+ "CALLING THE FUNCTION AGAIN WOULD INCREMENT THE OBJ2 VALUES AGAIN");
		System.out.println("Before math v2 using obj1 : "+" mvar1 = " + mvar1 + " mvar2 = " + 
				mvar2 + " obj1.var1 = " + obj1.var1 + " obj1.var2 = " + obj1.var2);
		System.out.println("\n\nmath version 2 - YET AGAIN....."); 
		
		obj1.math(obj1);
		System.out.println("After math v2 using obj1 : "+" mvar1 = " + mvar1 + " mvar2 = " + 
				mvar2 + " obj1.var1 = " + obj1.var1 + " obj1.var2 = " + obj1.var2);
		
		
		
		
		
		
		System.out.println("\n\nmath version 3....."); 
		Test obj3 = new Test();
		System.out.println("Before math v3 using obj3 : "+" mvar5 = " + mvar5);
		obj3.math(mvar5);
		System.out.println("After math v3 using obj3 : "+" mvar5 = " + mvar5);	
	
		System.out.println("\n\nmath version AGAIN....."); 
		System.out.println("Before math v3 using obj3 : "+" mvar5 = " + mvar5);
		obj3.math(mvar5);
		System.out.println("After math v3 using obj3 : "+" mvar5 = " + mvar5);	

	}
	
}