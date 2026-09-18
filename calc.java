import java.util.Scanner;
public class calc{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int numCookies = in.nextInt();
		int a = numCookies/10;
		int b = a/20;
		int c = a%20;
		int v = b*100 + c*4;
		System.out.print("Total Value: $" + v);
	}
}
