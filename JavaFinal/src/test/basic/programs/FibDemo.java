package test.basic.programs;

public class FibDemo {

	public static void main(String[] args) {

		
		int f1=0,f2=1,f3=0;
		int num=8;
		System.out.print(f1+","+f2);
		for(int i=0;i<8;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(" "+f3);
		}
		System.out.println("Tst");
		
	}
}
