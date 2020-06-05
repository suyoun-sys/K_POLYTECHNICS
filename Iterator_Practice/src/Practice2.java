import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> List = new HashSet<String>();
		
		List.add("°´Ã¼ÁöÇâÇÁ·Î±×·¡¹Ö");
		List.add("ÇÏµÓ");
		List.add("MangoDB");
		
		Iterator<String> it = List.iterator();
		
		while(it.hasNext()) {
			String word = (String) it.next();
			if(word.equals("ÇÏµÓ"))
			{
				System.out.println("<"+word+">");
			}
			else
				System.out.println(word);
		}
		
	}

}
