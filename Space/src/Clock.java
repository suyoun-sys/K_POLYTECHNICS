import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int H, M;
		
		Scanner sc = new Scanner(System.in);
		
		H = sc.nextInt();
		M = sc.nextInt();
		
		if(45<=M && M<60 && 0<=H && H<25) {
			M = M-45;
			System.out.println(H);
			System.out.println(M);
		}
		else if(0<=M && M<45 && 0<H && H<25) {
			H = H-1;
			M = (M+60)-45;
			System.out.println(H);
			System.out.println(M);
		}
		else if(0<=M && M<45 && 0==H){
			H = 23;
			M = (M+60)-45;
			System.out.println(H);
			System.out.println(M);
		}
		
	}

}
