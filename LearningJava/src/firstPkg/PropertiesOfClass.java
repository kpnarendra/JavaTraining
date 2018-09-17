package firstPkg;

public class PropertiesOfClass {

	Box myBox, hisBox, myBoxDup;

	public void printProprtiesOfClass() {

		System.out.println("myBox @ 1 = " + myBox);

		myBox = new Box();
		
		myBoxDup = myBox;
		

		System.out.println("myBox @ 2 = " + myBox);
		System.out.println("myBoxDup @ 3 = " + myBoxDup);
		System.out.println("myBox and myBoxDup are same have myBox.equals(myBoxDup) is : "+myBox.equals(myBoxDup));
		System.out.println("hisBox @ 4 =" + hisBox);
		System.out.println("myBox @ 5 = " + myBox);
		System.out.println("hisBox @ 6 =" + hisBox);

		hisBox = new Box();
		System.out.println("myBox reference : " + myBox.getClass());
		System.out.println("Super class of any class : " + myBox.getClass().getSuperclass().toString());

		try {
			System.out.println("hisBox reference : " + hisBox.getClass());
			System.out.println("Super class of any class : " + hisBox.getClass().getSuperclass().toString());

		} catch (NullPointerException ex) {
			System.err.println("NullPointerExceptionFound for object : hisBox \n" + ex);
		}
	}

}
