import java.util.Scanner;

public class ExWhile{

    public static void main(String[] args) { 
        
    	Scanner sc = new Scanner(System.in);
       
    	int k = sc.nextInt();
    	int j = k;
    	int l=0;
    	
    	while(true) {
    		k =(((k%10)+(k/10))%10)+(k%10)*10;
    		l++;
    		if(k==j) {
    			break;
    		}
    	}System.out.println(l);
    	
        
    }
}