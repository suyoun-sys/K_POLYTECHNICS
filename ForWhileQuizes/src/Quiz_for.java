
public class Quiz_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		
		for(i=3; i<=9; i++) {
			if(i==3 || i==5) {
				System.out.println("<"+i+"´Ü>");
			}
			for(j=1; j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("");
		}
	}

}
