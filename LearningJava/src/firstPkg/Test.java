/**
 * 
 */
package firstPkg;

/**
 * @author narendrakp
 *
 */
public class Test {

	int var1;
	int var2;
	
	Test(int var1, int var2){
		this.var1=var1;
		this.var2=var2;
	}
	
	
	Test() {
		// TODO Auto-generated constructor stub
	}


	void math(int var1, int var2){
		this.var1=var1+1;
		this.var2=var2+1;
	}
	
	 void math(Test lc_Obj){
		lc_Obj.var1 += 2;
		lc_Obj.var2 += 2;
	}
	
	 void math(int var3){
		var3 = var3 + 3;
	}
	
}
