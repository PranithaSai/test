import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double p,t,r;
		p=sc.nextDouble();
		t=sc.nextDouble();
		r=sc.nextDouble();
		SimpleIntrest si=new SimpleIntrest(p,t,r);
		double result1=si.calculatesi();
		double result2=si.calculateci();
		System.out.println("The value of simple intrest is "+result1);
		System.out.println("The value of compound intrest is "+result2);
		sc.close();
		
	}

}
