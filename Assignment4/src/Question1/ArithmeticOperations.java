package Question1;

interface Add{
	int add(int x,int y);
}

interface Subtract{
	int sub(int x,int y);
}

interface Multiply{
	int mul(int x,int y);
}

interface Divide{
	int div(int x,int y);
}

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		//Add addFunction = (int a,int b) -> a+b; //this can also be used
		Add addFunction = (a,b) -> a+b;
		System.out.println(addFunction.add(10,20));
		
		Subtract subFunction = (a,b) -> a-b;
		System.out.println(subFunction.sub(10,20));
		
		Multiply mulFunction = (a,b) -> a*b;
		System.out.println(mulFunction.mul(10,20));
		
		Divide divFunction = (a,b) -> a/b;
		System.out.println(divFunction.div(10,2));
		

	}

}
