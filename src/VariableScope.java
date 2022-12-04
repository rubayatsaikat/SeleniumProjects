
public class VariableScope {
	
	static int x=10, y=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum1:" +(x+y));
	if 	((x+y) > 10)
		{
		int a=5, b=6;
		System.out.println("Sum2:" +(a+b));
		}
	if(x > y)
		{
		System.out.println("Scope of class Variable: " + (x+y));
		}
	}

}
