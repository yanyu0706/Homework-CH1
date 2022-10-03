package lab1;

public class test_p34 {
	
	public static void main(String[] agrs) {
		
		int num1=10;
		int num2=5;
		
		System.out.println("num1和num2的各種運算");
		System.out.println("num1+num2等於"+(num1+num2));
		System.out.println("num1-num2等於"+(num1-num2));
		System.out.println("num1*num2等於"+(num1*num2));
		System.out.println("num1/num2等於"+(num1/num2));
		System.out.println("num1%num2等於"+(num1%num2));
		
		int a=0;
		int b=0;
		int c=0;
		
		b=a++;//把A給B再把A加1 
		c=++a;//先把A加1再給C
		
		System.out.println("因為是在指定值後之後才遞減,所以b的值為"+b);
		System.out.println("因為是在遞減後之後才指定值,所以c的值為"+c);
	}

}
