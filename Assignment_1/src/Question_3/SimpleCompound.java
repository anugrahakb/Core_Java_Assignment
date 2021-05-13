package Question_3;
import java.util .*;
public class SimpleCompound {

	public static void main(String[] args) {
		double p, rate, t, si, ci;
        System.out.print("Enter The Amount : ");
        Scanner read = new Scanner(System. in);
     p = read.nextDouble();

     System. out. print("Enter The No. of Years : ");
    t = read.nextDouble();

     System. out. print("Enter The Rate of Interest (ROI) : ");
     rate = read.nextDouble();

     //Calculating Simple Interest and Compound Interest
     si = (p * t * rate)/100;
     ci = p*Math.pow(1.0+rate/100.0,t)-p;

     //Displaying Simple Interest and Compound Interest
     System.out.println("Simple Interest = "+si);
     System.out. println("Compound Interest = "+ci);
	}

}
