import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		a = sc.nextInt();
		System.out.print("b=");
		b = sc.nextInt();
		a += b;
		b = a - b;
		a -= b;
		System.out.println("a="+a+"  b="+b);
	}
}
