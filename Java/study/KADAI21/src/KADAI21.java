
import java.util.ArrayList; 
import java.util.Collections;  
import java.util.Iterator; 
import java.io.*; 

public class KADAI21 {

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<Integer>();

		ls.add(new Integer("125"));   
		ls.add(new Integer("124"));   
		ls.add(new Integer("323"));   
		ls.add(new Integer("478")); 

		System.out.println(ls);

		InputStreamReader isr = new InputStreamReader(System.in);  
		BufferedReader br = new BufferedReader(isr);
		
		int x;
		while(true) {
			System.out.print("input integer: ");
			try {
				String buf = br.readLine();
				x = Integer.parseInt(buf);
				if(x == 0) {
					break;
				}
				ls.add(x);
			}
			catch(Exception e) {
				x = 0;
			}
		}
		
		Collections.sort(ls);
		
		Iterator<Integer> it = ls.iterator();
		
		int item1 = -1;
		while(it.hasNext()) {
			int item2 = ((Integer)it.next()).intValue();
			if(item1 == item2) {
				it.remove();
			}
			item1 = item2;
		}
		
		System.out.println(ls);
		
	}
}
