package firstPkg;

public class PropertiesOfClass {

	Box myBox, hisBox;

	public void printProprtiesOfClass() {

		System.out.println("myBox @ 1 = " + myBox);

		myBox = new Box();

		System.out.println("myBox @ 2 = " + myBox);

		System.out.println("hisBox @ 1 =" + hisBox);

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
