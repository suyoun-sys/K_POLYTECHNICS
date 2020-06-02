
public class Quiz_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int j=0;
		
		while(i<=7) {
			i++;
			if(i==3 || i==5)
				System.out.println("<"+i+"´Ü>");
			while(j<=8) {
					j++;
					System.out.println(i+"*"+j+"="+i*j);
				}
			j=0;
			System.out.println("");
		}
	}
}
