import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> List = new ArrayList<>();
		
		List.add("��ü�������α׷���");
		List.add("�ϵ�");
		List.add("MangoDB");
		
		Iterator<String> it = List.iterator();
		
		int a = 1;
		
		while(it.hasNext()) {
			
			String word = (String) it.next();
			if(a==1) {
				System.out.println("<"+word+">");
				a+=1;
			}
			else
				System.out.println(word);
		}
		
	}

}
