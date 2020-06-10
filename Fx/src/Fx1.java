
public class Fx1 {
	
    public static long sum(int[] a) {
        long ans = 0;
        
		for(int i=0; i<a.length; i++) {
			ans = ans + a[i];
		}
        return ans;
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b = {1, 2, 3, 4, 5};
		
		System.out.println(sum(b));
	}

}
