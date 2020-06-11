import java.util.Scanner;

public class AorB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>=-10000 && B<=10000) {
		if(A>B) {
			System.out.println(">");
		}
		else if(A<B) {
			System.out.println("<");
		}
		else
			System.out.println("==");
	}
}

}
