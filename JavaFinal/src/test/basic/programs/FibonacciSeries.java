package test.basic.programs;

public class FibonacciSeries {

	public static void fibonacciTest(int fib)
	{
       
		int f1=0,f2=1,f3;
		while(fib>0)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			fib--;
			System.out.print(" "+f3);
		}
		
	}
          
	public static void main(String[] args) {

    int num=8;
    int f1=0, f2=1;
    System.out.print(f1+ " "+f2);
    fibonacciTest(num);
	}
}
