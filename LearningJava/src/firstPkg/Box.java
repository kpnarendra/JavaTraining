/**
 * 
 */
package firstPkg;

/**
 * @author narendrakp
 *
 */
public class Box {
	double width;
	double height;
	double depth;

	Box() {
		System.out.printf("\n This is Empty constructor for " + this + " with hashcode : " + this.hashCode() + "\n");
	}

	Box(double width, double height, double depth) {
		System.out.println("Constructed a box with dimentions w,h,d - " + this + " with hashcode : " + this.hashCode());

		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double getBoxWidth() {
		return width;
	}

	double getBoxHeight() {
		return height;
	}

	double getBoxDepth() {
		return depth;
	}

	void overloadedMethod(int var1) {
		System.out.println("Inside overloadedMethod V1 - int PARAMETER - " + var1);
	}

	void overloadedMethod(String var1) {
		System.out.println("Inside overloadedMethod V2 - String PARAMETER - " + var1);

	}

	void overloadedMethod() {
		System.out.println("Inside overloadedMethod V3 - NO PARAMETERS");

	}
	
	
	
}
