import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> List = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ټ����� �ܾ �Է����ּ���.");
		
		List.add(s.nextLine());
		List.add(s.nextLine());
		List.add(s.nextLine());
		List.add(s.nextLine());
		List.add(s.nextLine());
		
		Iterator<String> it = List.iterator();
		while(it.hasNext()) {
			String word = (String) it.next();
			
			System.out.println(word);
		}
		
	}

}
