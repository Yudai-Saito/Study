
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class KADAI20 {

	public static void main(String[] args) {
		
		ArrayList<String> x = new ArrayList<String>();
		
		x.add("Tiger");
		x.add("Elephant");
		x.add("Lion");
		x.add("Capybara");
		
		System.out.println(x);
		
		Collections.sort(x);
		System.out.println(x);
		
		Iterator<String> it = x.iterator();
		while(it.hasNext()) {
			String y = (String)it.next();
			if(y.equals("Lion")) {
				it.remove();
			}
		}
		
		System.out.println(x);
	}
}
