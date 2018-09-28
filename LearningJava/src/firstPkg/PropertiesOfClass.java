package firstPkg;

public class PropertiesOfClass {

	Box myBox, hisBox, myBoxDup;

	public void printProprtiesOfClass() {

		System.out.println("myBox @ 1 = " + myBox + ". Hashcode cant be retrieved as myBox object is null.");

		myBox = new Box();
		
		myBoxDup = myBox;
		

		System.out.println("myBox @ 2 = " + myBox + " with hashcode : " + myBox.hashCode());
		System.out.println("myBoxDup @ 3 = " + myBoxDup + " with hashcode : " + myBoxDup.hashCode());
		System.out.println("myBox and myBoxDup are same have myBox.equals(myBoxDup) is : "+myBox.equals(myBoxDup));
		System.out.println("hisBox @ 4 =" + hisBox + ". Hashcode cant be retrieved as myBox object is null.");
		System.out.println("myBox @ 5 = " + myBox + " with hashcode : " + myBox.hashCode());
		
		hisBox = new Box();
		
		System.out.println("hisBox @ 6 =" + hisBox + " with hashcode : " + hisBox.hashCode());

		
		System.out.println("myBox reference : " + myBox.getClass());
		System.out.println("Super class of any class : " + myBox.getClass().getSuperclass().toString());

		try {
			System.out.println("hisBox reference : " + hisBox.getClass());
			System.out.println("Super class of any class : " + hisBox.getClass().getSuperclass().toString());

		} catch (NullPointerException ex) {
			System.err.println("NullPointerExceptionFound for object : hisBox \n" + ex);
		}
		
		Box realBox = new Box(11.0,22.0,33.55);
		
		System.out.println("Witdth of realBox is : "+realBox.getBoxWidth());
		System.out.println("Height of realBox is : "+realBox.getBoxHeight());
		System.out.println("Depth of realBox is : "+realBox.getBoxDepth());
		
		
		System.out.println("Calling overloadedMethod with No Parameters : " );
		myBox.overloadedMethod();
	
		double par1 = 10.0;
		System.out.println("Calling overloadedMethod with double Parameter <not present an overloaded method> : " );
		myBox.overloadedMethod((int) par1); // need to type cast double to int as Java does automatic type casting to heavier variable 
	
		int par2 = (int) par1;
		
		double par3 = par2; // type casting from int to double is automatically handled by java.
		
		System.out.println("Calling overloadedMethod with string Parameter : " );
		myBox.overloadedMethod("testing with string");
		
	}
	
	Box b1 = new Box(10.0,20.0,30.0);
	Box b2 = new Box(10,20,30);
	
	void checkBox(){
		//System.out.println(b1=b2);
		System.out.println("b1.equals b2 : " + b1.equals(b2));
		
	}
	

}
